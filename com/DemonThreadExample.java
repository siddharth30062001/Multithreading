package com;

class Demo extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName()+" is Demon Thread");
        }
        else{
            System.out.println("user thread running");
        }
    }

}
public class DemonThreadExample {
    
    public static void main(String[] args) {
        
        Demo d1=new Demo();
        d1.setName("Thread1");
        Demo d2=new Demo();
        d2.setName("Thread2");
        Demo d3=new Demo();
        d3.setName("Thread3");

        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.start();
    }
}
