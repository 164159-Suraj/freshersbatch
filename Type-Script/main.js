"use strict";
exports.__esModule = true;
var main = /** @class */ (function () {
    function main() {
        this.taskService = ["Wake up", "Brush your teeth"];
    }
    main.prototype.addTask = function (task) {
        this.taskService.push(task);
        console.log("Value Inserted into the list and the length become:" + this.taskService.length);
    };
    main.prototype.removeTask = function (task) {
        var index = this.taskService.indexOf(task, 0);
        if (index > -1) {
            this.taskService.splice(index, 1);
            console.log("Value deleted from the list at position:" + "  " + this.taskService.length);
        }
        else {
            console.log("Value not present,  Please provide a correct value");
        }
    };
    main.prototype.listAllTask = function () {
        console.log(this.taskService);
    };
    return main;
}());
var obj = new main();
obj.addTask("BuyEggs");
obj.addTask("Do Codding");
//obj.addTask("Watch Movie");
obj.listAllTask();
//console.log(obj.taskList);
obj.removeTask("Brush your teeth");
//console.log(obj.taskList)
obj.listAllTask();
obj.removeTask("Do Codding");
//console.log(obj.taskList);
obj.removeTask("BuyEggs");
obj.listAllTask();
//console.log(obj.taskList);
