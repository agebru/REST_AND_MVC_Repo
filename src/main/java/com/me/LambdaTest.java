package com.me;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		
		// 1
		MyFunction<String,Integer,String> myfunc=(Integer x,String y)->{
	  if(x==2) {
		  return y+" "+y;
	  }
	  
	  else if(x==3) {
		  return y+" "+y+" "+y;  
	  }
	  else return y;
  };
  
  String apply = myfunc.apply(3, "Hello");
  
  System.out.println(apply);
  
  
  
  // 2
  
  MyFunction<List<String>,Integer,String> myfunc2=(x,y)	->{
	  
	  List<String> names=new ArrayList<>();
	  
	  if(x==1) {
		  names.add(y);  
	  }
	  
	  else if(x==2) {
		  names.add(y);
		  names.add(y+" "+1); 
	  }
	  else if(x==3) {
		  names.add(y);
		  names.add(y+" "+1); 
		  names.add(y+" "+2); 
	  }
	return names;
	  
  };
  
  List<String> names = myfunc2.apply(3, "Amanuel");
  for(String name:names) {
	  System.out.println(name);
  }
  
  
  
  
	}

}
