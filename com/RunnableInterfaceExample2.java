package com;

//using lambda expression

public class RunnableInterfaceExample2 {

    public static void main(String [] args)throws Exception{

    Thread obj1=new Thread(()->{

            for(int i=0;i<5;i++){
                System.out.println("Hi");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    });

    Thread obj2=new Thread(()->{

            for(int i=0;i<5;i++){
                System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });

    obj1.start();
    try {
        Thread.sleep(100);
    } catch (Exception e) {
        e.printStackTrace();
    }

    obj1.setName("Hi Thread");   // use to set the name of thread
    obj2.setName("Hello Thread");

    System.out.println(obj1.getName());  //use to print the name of thread
    System.out.println(obj2.getName());

    obj2.start();

    System.out.println(obj1.isAlive());  // use to check thread is dead or alive

    obj1.join();  //because of using these bye will be printed after completing both the thread          // 
    obj2.join();

    System.out.println(obj1.isAlive());  // use to check thread is dead or alive

    System.out.println("Bye");

}
    
}
