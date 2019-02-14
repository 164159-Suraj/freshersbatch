var Abc = /** @class */ (function () {
    function Abc() {
    }
    Abc.prototype.greeter = function (person, iD) {
        return ("Hello, " + person + ",  " + iD);
    };
    return Abc;
}());
var obj = new Abc();
var s = obj.greeter("suraj", 164159);
console.log(s);
