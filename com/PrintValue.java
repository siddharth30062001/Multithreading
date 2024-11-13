package com;

class M extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);

            try{
            Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class N extends Thread{

    public void run(){
        for(int i=11;i<=15;i++){
            System.out.println(i);

            try{
            Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class PrintValue {

    public static void main(String[] args) {
        
        M a1=new M();
        N a2=new N();

        // a1.run();
        // a2.run();

        a1.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
           System.out.println(e);
        }
        a2.start();
    }
    
}
