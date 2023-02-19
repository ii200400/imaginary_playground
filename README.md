# 🎪 상상놀이터(소아병동 아이들을 위한 IoT 서비스)

## 💁‍♀️ 프로젝트 소개

- **프로젝트 기간**

  - 2022.07.05 ~ 2022.08.19 (7주)
  
- 👨‍👧‍👧 요들(요셉과 아이들)팀
  
  - 6명 (Front-end 3명, Back-end 2명, IOT 1명)

- **기획 배경**
  
  **어디서도 아이들의 상상력이 멈추지 않도록**✨

  상상놀이터는 **소아병동 아이들을 위한 교육 및 놀이 통합형 IoT 서비스**입니다.

  병원이라는 제한적인 공간에서 오랜 시간을 보내는 환우들에게 다양한 경험을 선물해주고 싶어 기획하게 되었습니다. 또한 힘든 치료와 장기입원으로 인해 또래들보다 신체적 및 정서적 발달이 늦은 아이들에게 놀이를 통해 도움을 주고자 하였습니다.

- **특징**

  * 아이들의 이목을 끄는 4개의 테마(정글, 우주, 바다, 크리스마스)
  * 아이들의 정서적 및 신체적 발달을 위한 간단한 놀이 제공
  * 회원 담당 환자등록 서비스
  * 회원관리 및 1대1 문의 서비스
  * 빔 프로젝터, 키오스크 등 확장 가능한 IoT & 웹 서비스

- **서비스 화면**

  - [웹 게임 화면 흐름도](https://www.notion.so/917844d38c464a9ba6a8ed01729709f3)
  - [웹사이트 화면 흐름도](https://www.notion.so/34eaae0279ef4f08ae12cacf2265f364)

- **배포**

  - 웹사이트 주소: [https://i7d204.p.ssafy.io/login](https://i7d204.p.ssafy.io/login)
  - 게임 사이트 주소:  [https://common-test-0808.netlify.app/](https://common-test-0808.netlify.app/)

</br>

## 🏆 수상 내역

  - [싸피 사회공헌 대표 프로젝트](https://youtu.be/ahgLgfGCZPs)
  - [SSAFY 공통 프로젝트 최우수](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e859eeb6-ce6f-491d-8079-307ce9531f97/%EC%83%81%EC%83%81%EB%86%80%EC%9D%B4%ED%84%B0%EC%83%81%EC%9E%A5.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20230219%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20230219T130951Z&X-Amz-Expires=86400&X-Amz-Signature=b360f6d34e1e6052f6f3517bd9b2ef8ef70cfcfa613d1a84df9ffe0a9b019967&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22%25EC%2583%2581%25EC%2583%2581%25EB%2586%2580%25EC%259D%25B4%25ED%2584%25B0%25EC%2583%2581%25EC%259E%25A5.png%22&x-id=GetObject)
  - [SSAFY UCC 경진대회 전국 1위 입상](https://www.youtube.com/watch?v=CdfojzqRaxo&ab_channel=sojung)
  - [SSAFY 인터뷰](https://www.youtube.com/watch?v=zck0G1kbDmA&ab_channel=%EC%82%BC%EC%84%B1%EC%B2%AD%EB%85%84SW%EC%95%84%EC%B9%B4%EB%8D%B0%EB%AF%B8Youtube%EC%B1%84%EB%84%90HELLOSSAFY)

## 📒 주요 기술

- 프론트엔드
  - React
  - Three.JS(3D 웹 실행)
  - Blender(3D 캐릭터 구현)
  - Axios (API 통신 라이브러리)
  - Mui(리액트 CSS 라이브러리)
  - Javascript, Redux(리액트 상태관리 라이브러리)
  - HTML5
  - CSS3

- 백엔드
  - Java 11
  - Spring Boot 2.7.1
  - Spring Security 5.7.2
  - OAuth2.0
  - JWT
  - Naver Clova/Google Speech (음성인식 기능)
  - MariaDB
  - MyBatis


- 배포
  - Docker
  - AWS
  - Jenkins

- IoT
  - 라즈베리파이(Raspberry Pi 4 Model B)
  - Face recognition (얼굴인식)
  - Teachable Machine (자세인식)
  - Python
  - Arduino IDE
  - C
  - Socket.io, WebSocket
  - Node.js

- 협업 툴
  - JIRA
  - Notion
  - Mattermost (팀 협업, 프로젝트 관리)
  - GitLab(버전관리)
  - Figma(디자인 협업)
  - ERD cloud(DB 모델링)
  - Coggle(마인드맵)

</br>

## 🛠 IoT 장비

- 장비 구성
  - 초음파 센서 (HC-SR04P)
  - 아두이노 wifi 모듈 (Wemos D1 mini)
  - 아두이노 wifi 모듈 배터리 쉴드 (WeMos D1 Mini Battery Shield)
  - 리튬폴리머배터리 (lithium polymer battery YJ603450)

- 툴
  - [Fritzing](https://fritzing.org/)

- [사진 및 상세내용](https://quill-peripheral-d93.notion.site/IoT-27d0904303e84f4a87292032b0cc3b62)

## 🕋 프로젝트 구성도

<img src="./db/ERD_imaginationPlayground.png">

- [디렉토리 구조](https://github.com/ii200400/imaginary_playground/tree/develop/backend#%EB%94%94%EB%A0%89%ED%86%A0%EB%A6%AC-%EA%B5%AC%EC%A1%B0)

</br>

## 👀 더 찾아보기

* [노션](https://quill-peripheral-d93.notion.site/ed5a71762fd1428097710fd05e435e20)

