var express = require('express');
var app = express();

app.get('/year',function(req, res){
    var id=req.query.id;
    var year=2018-id;
    res.send("you are born in:"+year);
});

app.listen(3004);