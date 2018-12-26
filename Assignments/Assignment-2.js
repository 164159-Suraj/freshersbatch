var fs = require('fs');

try {  
    var data = fs.readFileSync('my-file.txt', 'utf8');
    console.log(data);    
} catch(e) {
    console.log('Error:', e.stack);
}