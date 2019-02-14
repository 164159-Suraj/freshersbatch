interface xyz{
    greeter(p:string,id:number):string;
}
class Abc implements xyz{
 greeter(person : string, iD : number):string{
    return("Hello, " + person +",  " +iD);
}
}
var obj =new Abc();
var s=obj.greeter("suraj", 164159);
console.log(s);
