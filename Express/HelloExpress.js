var express = require('express');
var app = express();

app.get('/a', function(req, res){
   res.send("Hello world from express!!!!!!!!");
});

app.listen(3001);