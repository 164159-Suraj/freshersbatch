package com.suraj.generics;
import java.util.ArrayList;
public class MyList<T> {
	  private T t;

	   public void add(T t) {
	      this.t = t;
	   }
	 ArrayList<T> arr=new ArrayList<T>();
	 public void Listadd(){
		 arr.add(t);
	 }
	     
	   public T get1() {
	      return t;
	   }
	   public T get2(){
		   return (T) arr;
	   }
}
