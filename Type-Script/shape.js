var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return 3.14 * (this.radius) * (this.radius);
    };
    return Circle;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(color, length, breadth) {
        this.color = color;
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle.prototype.area = function () {
        return (this.length) * (this.breadth);
    };
    return Rectangle;
}());
var obj1 = new Circle("Red", 15);
console.log("Circle--" + " " + obj1.area() + "--" + obj1.color);
var obj2 = new Rectangle("Blue", 10, 20);
console.log("Rectangle--" + " " + obj2.area() + " " + obj2.color);
