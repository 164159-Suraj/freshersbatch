interface FullShape {
    color: string;
    area():number;
    toString();
   }

   class Circle implements FullShape {
       color:string;
       radius:number;
        constructor(color:string,radius:number){
           this.color=color;
           this.radius=radius;
         
       }

        area():number{
        return 3.14*(this.radius)*(this.radius);
    }

   }


   class Rectangle implements FullShape {
    color:string;
   length:number;
   breadth:number;
     constructor(color:string,length:number,breadth:number){
        this.color=color;
        this.length=length;
        this.breadth=breadth;
      
    }

     area():number{
     return (this.length)*(this.breadth);
 }

}

   let obj1 = new Circle("Red",15);
   console.log("Circle--"+" "+obj1.area()+"--"+obj1.color);

   let obj2=new Rectangle("Blue",10,20);
   console.log("Rectangle--"+" "+obj2.area()+" "+obj2.color);