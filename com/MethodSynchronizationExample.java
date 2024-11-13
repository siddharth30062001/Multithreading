package com;


class CheckCount{

    int count=0;

    //making method synchronized makes thread safe
        public  synchronized void increment(){
        count++;
    }
}

public class MethodSynchronizationExample {

    public static void main(String[] args) throws Exception {
        
        CheckCount c=new CheckCount();

        Thread t1 = new Thread(new Runnable() {
            
            public void run(){

                for(int i=1;i<=1000;i++){

                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            
            public void run(){

                for(int i=1;i<=1000;i++){

                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count value is: "+c.count);
    }

    
}