package com;


class A extends Thread{

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

class B extends Thread{

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

public class Display {

    public static void main(String[] args) {
        
        A a=new A();
        B a1=new B();

        a.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
        a1.start();
    }
    
}