var express = require("express");
var app = express.Router();

app.get("/users/:id", async (req, res) => {
  if (!req.params || !req.params.id) {
    res.status(403).send({ msg: "파라미터를 입력해주세요" });
    return;
  }

  var selectParams = {
    id: req.params.id
  };

  var selectQuery = req.mybatisMapper.getStatement(
    "BASE",
    "AUTH.SELECT.TB_VU.001",
    selectParams,
    { language: "sql", indent: "  " }
  );

  let data = [];
  try {
    data = await req.sequelize.query(selectQuery, {
      type: req.sequelize.QueryTypes.SELECT
    });
    console.log("TCL: data", data);
  } catch (error) {
    res.status(403).send({ msg: "rdb select 실패", error: error });
    return;
  }

  if (data.length == 0) {
    res.status(403).send({ msg: "정보 없음" });
    return;
  }

  res.json({
    msg: "RDB에서 정보 꺼내오기",
    user: data.map(x => {
      x.vu_password = "";
      return x;
    })[0]
  });
});

app.post("/", function(req, res) {
  res.json({ success: "post call succeed!", url: req.url, body: req.body });
});

module.exports = app;
