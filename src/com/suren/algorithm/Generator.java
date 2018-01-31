package com.suren.algorithm;


public class Generator extends Thread {
  static  public int number;
  public int numbershow(){
      return number;
  }
    public void run(){
        for(;;){
for(int i=1;i<=10;i++){
    try{
    Thread.sleep(4);
    number=i;
    
     //System.out.println("in thread"+number);
    }catch(Exception e){
        System.out.println(e);
    }
}
}
}
}