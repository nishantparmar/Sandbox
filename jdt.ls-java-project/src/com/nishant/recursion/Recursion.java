package com.nishant.recursion;

public class Recursion{

 //Recursive Example
  //f(n) = f(n-1) + f(n-2)
  public static int fibonacci (int n){
    if(n==0){
      return 0;
    }else if(n == 1){
      return 1;
    }else{
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  
}