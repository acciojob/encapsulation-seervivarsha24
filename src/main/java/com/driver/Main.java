package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly r=new RWOnly();
      //r.name="varsha"; without getter and setter we cannot access private variables or methods
      r.setName("Varsha");
      System.out.println(r.getName());
  }
}