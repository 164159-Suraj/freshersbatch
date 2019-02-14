class TaskServices{
   taskList:string[]=["Wake up","Brush your teeth"];
    
   addTask(task:string):void{
      length= this.taskList.push(task);
        console.log("Value Inserted into the list and the length become:"+length);
   }


   removeTask(task:string):void{
     const index=this.taskList.indexOf(task,0);
     if(index>-1){
         this.taskList.splice(index,1);
         console.log(index+" "+"Value deleted from the list"+this.taskList.length);
     }
     else{
         console.log("Value not present,  Please provide a correct value");
     }

}

listAllTask():void{
   /* this.taskList.forEach(function(Value){
        console.log(Value);
    })*/

    console.log(this.taskList);
}

}


let ob=new TaskServices();
ob.addTask("BuyEggs");
ob.addTask("Do Codding");
ob.addTask("Watch Movie");
ob.listAllTask();
//console.log(obj.taskList);
ob.removeTask("Brush your teeth");
//console.log(obj.taskList)
ob.listAllTask();
ob.removeTask("Do Codding");
//console.log(obj.taskList);

ob.removeTask("BuyEggs");
ob.listAllTask();
//console.log(obj.taskList);