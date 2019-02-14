package com.SURAJ.oops;

public  class Singletone {
	  
// static variable single_instance of type Singletone 
    private static Singletone single_instance = null; 
    public String s;  
	private Singletone(){
		s="Hello Everyone!";
	}
	  // static method to create instance of Singletone class 
    public static Singletone getInstance(){
   
           if (single_instance == null) 
                 single_instance = new Singletone(); 
  
          return single_instance; 
    }

    public static void main(String[] args) {
    	 // instantiating Singletone class with variable obj1 
          Singletone obj1 = Singletone.getInstance(); 
        
        // instantiating Singletone class with variable obj2
          Singletone obj2 = Singletone.getInstance(); 
        
       // instantiating Singletone class with variable obj3 	
          Singletone obj3 = Singletone.getInstance(); 
        
        System.out.println(obj1.s);
        System.out.println(obj1.hashCode());
        
        System.out.println(obj2.s);
        System.out.println(obj2.hashCode());
        
        System.out.println(obj3.s);
        System.out.println(obj3.hashCode());
	}
}
