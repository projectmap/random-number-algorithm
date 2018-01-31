package com.suren.algorithm;







public class Randomm extends Thread{

    
    public static void main(String[] args) {
        int no;
     Generator gen=new Generator();
     gen.start();
  new Showno().setVisible(true);
   for(;;){
      no=Generator.number;
      try{
      Thread.sleep(4);
      }catch(Exception e){
          System.out.println(e);
      }
       //System.out.println("in main"+no);
   }
       
   
    
    
    

    }
    
}
