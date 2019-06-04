package com.example.demo.model;

public class Form {

  private int num1;
  private int num2;
  private int total = 0;

  public int getNum1(){
    return num1;
  }

  public void setNum1(int num){
    this.num1 = num;
  }

  public int getNum2(){
    return num2;
  }

  public void setNum2(int num){
    this.num2 = num;
  }

  public int getTotal(){
    return total;
  }

  public void setTotal(int total){
    this.total = total;
  }
  public void sumTotal(){
    total = this.num1 + this.num2;
    setTotal(total);    
  }
}