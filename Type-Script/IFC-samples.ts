export interface TodoInterface{
    taskService:string[];
    addTask(task:string):void;
    removeTask(task:string):void;
    listAllTask():void;
}
