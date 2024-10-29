package com;

public class Example2 implements Runnable{

    public void run(){
        System.out.println("Thread is running!!");
    }

    public static void main(String[] args) {
        
        Example2 e1=new Example2();
        Thread t=new Thread(e1,"mythread");
        t.start();
        System.out.println(t.getName());
    }
    
}
