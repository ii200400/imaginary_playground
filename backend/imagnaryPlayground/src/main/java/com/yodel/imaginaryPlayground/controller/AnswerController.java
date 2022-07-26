package com.yodel.imaginaryPlayground.controller;

import com.yodel.imaginaryPlayground.model.dto.AnswerDto;
import com.yodel.imaginaryPlayground.model.dto.QuestionDto;
import com.yodel.imaginaryPlayground.service.AnswerService;
import com.yodel.imaginaryPlayground.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api("QuestionController V1")
@RestController
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {
    private final String success = "SUCCESS"; //이 부분을 한 객체로 묶어서 사용할 수는 없을까?
    private final String fail = "FAIL";
    private final String error = "ERROR";
    private final AnswerService answerService;

    @GetMapping("/")
    @ApiOperation(value = "답변 등록", notes = "관리자가 답변을 등록할 수 있는 기능")
    public Map<String, Object> saveAnswer(
            @RequestBody @ApiParam(value = "답변등록에 필수요소인 AnswerDTO 내용을 보낸다.", required = true) AnswerDto answer){
        Map<String, Object> result = new HashMap<>();
        try {
            int res = answerService.isCompleted(answer.getQuestion_id())==0? 0: answerService.saveAnswer(answer);
            if(res == 1){
                result.put("status", success);
                Map<String, String> map = new HashMap<>();
                map.put("key", "completed");
                map.put("value", "0");
                result.put("data", answerService.lookupUncompletedAnswer(map));
            }else{
                result.put("status", fail);
            }
        } catch (Exception e) {
            result.put("status", error);
            result.put("message", e.toString());
        }
        return result;
    }

    @PutMapping("/")
    @ApiOperation(value = "답변 수정", notes = "관리자가 답변을 수정할 수 있는 기능")
    public Map<String, Object> editAnswer(
            @RequestBody @ApiParam(value = "답변수정에 필수요소인 AnswerDTO 내용을 보낸다.", required = true) AnswerDto answer){
        Map<String, Object> result = new HashMap<>();
        try {
            int res = answerService.editAnswer(answer);
            if(res == 1){
                result.put("status", success);
                Map<String, String> map = new HashMap<>();
                map.put("key", "completed");
                map.put("value", "0");
                result.put("data", answerService.lookupUncompletedAnswer(map));
            }else{
                result.put("status", fail);
            }
        } catch (Exception e) {
            result.put("status", error);
            result.put("message", e.toString());
        }
        return result;
    }

    @PostMapping  ("/delete")
    @ApiOperation(value = "답변 삭제", notes = "관리자가 답변을 삭제할 수 있는 기능")
    public Map<String, Object> deleteQuestion(
            @PathVariable @ApiParam(value = "답변삭제에 필요한 answer의 id값과 user_id를 전송한다.", required = true)
            Map<String, Integer> map){
        Map<String, Object> result = new HashMap<>();
        //이후 토큰의 id와 user_id값을 비교한다.
        try {
            int res = answerService.deleteAnswer(map.get("id"));
            if(res == 1){
                result.put("status", success);
                Map<String, String> map2 = new HashMap<>();
                map2.put("key", "completed");
                map2.put("value", "0");
                result.put("data", answerService.lookupUncompletedAnswer(map2));
            }else{
                result.put("status", fail);
            }
        } catch (Exception e) {
            result.put("status", error);
            result.put("message", e.toString());
        }
        return result;
    }

    @GetMapping("/detail/{question_id}")
    @ApiOperation(value = "답변 상세 정보", notes = "관리자가 답변을 등록할 수 있는 기능")
    public Map<String, Object> detailAnswer(
            @RequestBody @ApiParam(value = "question_id에 해당하는 답변을 불러오기", required = true) @PathVariable int question_id){
        Map<String, Object> result = new HashMap<>();
        try {
            AnswerDto answer = answerService.detailAnswer(question_id);
            if(answer != null){
                result.put("status", success);
                result.put("data", answer);
            }else{
                result.put("status", fail);
            }
        } catch (Exception e) {
            result.put("status", error);
            result.put("message", e.toString());
        }
        return result;
    }
}
