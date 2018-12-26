var fs = require('fs');

var data = "New File Contents\n Hello everyone!!!!!!!!!";

fs.writeFile('hello.txt', data, function(err, data){
    if (err) console.log(err);
    console.log("Successfully Written to HelloFile.");
});