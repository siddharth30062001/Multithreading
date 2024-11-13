package com;


class A implements Runnable{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B implements Runnable{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class RunnableInterfaceExample {

    public static void main(String[] args) {
        
        Runnable r1 = new A();
        Runnable r2 = new B();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
    }
    
}
