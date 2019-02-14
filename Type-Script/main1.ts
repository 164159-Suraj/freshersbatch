import { TodoItemInterface }from  './interface';
import{Todolist} from './interface';
export class Todo implements TodoItemInterface{
     title: string; 
     status: boolean;
     upadatedAt: Date;

     constructor(title:string,status:boolean){
      this.title=title;
      this.status=status;
      var x=this.toggleStatus(this.status);
      this.status=x;
      this.upadatedAt=new Date();
     }
    toggleStatus(status) {
       if(this.status==true){
        return  false;
       }
       else {
       return  true;
    }
}
}

class todoLIstClass implements Todolist{
    TodoItems: Todo[]= new Array(); 
       addTask(task:Todo) {
        
      this.TodoItems.push(task) ;
      console.log("Item inserted and length of the list is:    "+this.TodoItems.length)
    }
    listAllTasks() {
        console.log(this.TodoItems);
    }
    deleteTask(task:Todo) {
        var len=this.TodoItems.indexOf(task,0);
        console.log(len)
        if(len>-1){
           var removed= this.TodoItems.splice(len,1);
           console.log("element removed successfully and the length of the list becomes:    "+this.TodoItems.length);
        }
        else{
            console.log("Value not present in the list\n Please Enter the correct value to be deleted");
        }
    }


}
var obj=new todoLIstClass();
var val=new Todo("go to bed",true);
obj.addTask(new Todo("Wake up",true));
obj.addTask(new Todo("Wash your face",false));
obj.addTask(new Todo("Brush Your teeth",true));
obj.addTask(new Todo("Buy eggs for breakfast",false));
obj.addTask(val);
obj.listAllTasks();
obj.deleteTask(val); 
obj.listAllTasks(); 