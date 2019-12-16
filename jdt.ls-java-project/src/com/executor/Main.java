package com.executor;

import com.nishant.binarysearch.BinarySearch;


class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    // MyArray myArray = new MyArray();
    // myArray.addObject("newElement-1");
    // myArray.addObject("newElement-2");
    // myArray.addObject("newElement-3");

    // System.out.println(myArray.getObject(2));

    System.out.println(fibonacci(0));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(2));
    System.out.println(fibonacci(3));
    System.out.println(fibonacci(4));
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(6));
    System.out.println(fibonacci(7));
    System.out.println(fibonacci(8));
    System.out.println(fibonacci(9));
    System.out.println(fibonacci(10));

  int[] array = {1,2,9,19,31,42,87,209,345};
  System.out.println(searchArray(array, 87));

  }

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

  public static boolean searchArray(int[] array, int x){
    return binarySearchArray(array, x, 0, array.length -1);
  }

  //{1,2,9,19,31,42,87,209,345}
  public static boolean binarySearchArray(int[] array, int x, int left, int right){
    if(left > right){
      return false;
    }
    int mid = (left + right)/2;
    System.out.print(" ----- " + mid + " ----- ");
    if(array[mid] == x){
      return true;
    }else if(array[mid] < x){
      return binarySearchArray(array, x, mid +1 , right);
      
    }else{
      return binarySearchArray(array, x, left, mid -1);
    }
  }

  public static void printArray(int[] array){
    for(int i=0; i < array.length ; i++){
      System.out.print(array[i] + ", ");
    }

  }

}