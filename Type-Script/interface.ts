import {Todo} from './main1';
export interface TodoItemInterface{
    title:string;
    status:boolean;
    upadatedAt:Date;
    toggleStatus(satatus:boolean):boolean;
}

export interface Todolist{
    TodoItems:Todo[];
    addTask(task:Todo):void;
    listAllTasks():void;
    deleteTask(task:Todo):void;
    }

