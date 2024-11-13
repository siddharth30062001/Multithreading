package com;

public class UsingRunnableInterface implements Runnable{

    public void run(){
        System.out.println("Thread is running!!");
    }

    public static void main(String[] args) {
        
        UsingRunnableInterface e1=new UsingRunnableInterface();
        Thread t=new Thread(e1,"mythread");
        t.start();
        System.out.println(t.getName());
    }
    
}
