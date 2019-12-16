package com.nishant.binarysearch;

public class BinarySearch{

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


}