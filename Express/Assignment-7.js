var express = require('express');
var app = express();

var list=['watch','sunglass','choclate'];


app.get('/fetch',function(req, res){
    var id=req.query.id;
    if(id>list.length-1){
        res.send("No such ID present!!!!!! Enter a valid ID ")
    }
    var value=list[id];
    res.send(value);
    
});

app.post('/addq',function(req, res){
    var va=req.query.v;
    console.log(va);
    list.push(va);
    res.send(list);
});

app.delete('/remove',function(req, res){
    var id=req.query.id;

    if(id>list.length-1){
        res.send("No such ID present!!!!!! Enter a valid ID ")
    }
    list.splice(id,1);
    res.send(list);
});


app.put('/modify',function(req, res){
    var id=req.query.id;
    var name=req.query.name;
    if(id>list.length-1){
        res.send("No such ID present!!!!!! Enter a valid ID ")
    }
   list[id]=name;
    res.send(list);
    
});


app.listen(3009);