package com;

public class DeadLockExample1 {

    public static void main(String[] args) {
        
    
    final String runner1="Printer";
    final String runner2="Scanner";

    Runnable r1=()->{
        synchronized (runner1){
            System.out.println(Thread.currentThread().getName() + " Locked " +runner1);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (runner2){

                System.out.println(Thread.currentThread().getName()+ " Locked "+ runner2);
            }
        }
    };

    Runnable r2=()->{
        synchronized (runner2){
            System.out.println(Thread.currentThread().getName() + " Locked " +runner2);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (runner1){

                System.out.println(Thread.currentThread().getName()+ " Locked "+ runner1);
            }
        }
    };

    Thread t1=new Thread(r1,"Desktop");
    Thread t2=new Thread(r2,"Laptop");

    t1.start();
    t2.start();

    
}
}
