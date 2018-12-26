 const testFolder = '/node_js_Assignment/Assignments/';
const fs = require('fs');

fs.readdir(testFolder, (err, files) => {
    if(err) throw err;
for(var i=0;i<files.length;i++){
    console.log(files[i]);
}
  });
 


