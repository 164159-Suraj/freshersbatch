"use strict";
exports.__esModule = true;
var Todo = /** @class */ (function () {
    function Todo(title, status) {
        this.title = title;
        this.status = status;
        var x = this.toggleStatus(this.status);
        this.status = x;
        this.upadatedAt = new Date();
    }
    Todo.prototype.toggleStatus = function (status) {
        if (this.status == true) {
            return false;
        }
        else {
            return true;
        }
    };
    return Todo;
}());
exports.Todo = Todo;
var todoLIstClass = /** @class */ (function () {
    function todoLIstClass() {
        this.TodoItems = new Array();
    }
    todoLIstClass.prototype.addTask = function (task) {
        this.TodoItems.push(task);
        console.log("Item inserted and length of the list is:    " + this.TodoItems.length);
    };
    todoLIstClass.prototype.listAllTasks = function () {
        console.log(this.TodoItems);
    };
    todoLIstClass.prototype.deleteTask = function (task) {
        var len = this.TodoItems.indexOf(task, 0);
        console.log(len);
        if (len > -1) {
            var removed = this.TodoItems.splice(len, 1);
            console.log("element removed successfully and the length of the list becomes:    " + this.TodoItems.length);
        }
        else {
            console.log("Value not present in the list\n Please Enter the correct value to be deleted");
        }
    };
    return todoLIstClass;
}());
var obj = new todoLIstClass();
var val = new Todo("go to bed", true);
obj.addTask(new Todo("Wake up", true));
obj.addTask(new Todo("Wash your face", false));
obj.addTask(new Todo("Brush Your teeth", true));
obj.addTask(new Todo("Buy eggs for breakfast", false));
obj.addTask(val);
obj.listAllTasks();
obj.deleteTask(val);
obj.listAllTasks();
