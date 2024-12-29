/*Write a java program in which thread sleep for 6 sec in the loop in reverse order 
from 5 to 1 and change the name of thread. */

class ReverseThread extends Thread{
    public void run(){
        for(int i=5;i>=1;i--){
            Thread.currentThread().setName("Reverse Thread "+i);
            System.out.println(Thread.currentThread().getName()+"   Number : "+i);
            try {
                Thread.sleep(6000);
            } catch (Exception e) {
            }
        }
        
    }
}

public class threadnameandvalue {
    public static void main(String[] args) {
        ReverseThread obj=new ReverseThread();
        obj.start();
    }
    
}