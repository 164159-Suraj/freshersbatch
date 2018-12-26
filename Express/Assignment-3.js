var express = require('express');
var app = express();

app.get('/home', function(req, res){
   res.send("Hello world from express!!!!!!!!");
});

app.listen(process.argv[2]);