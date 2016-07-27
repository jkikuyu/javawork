
package com.zeno.projects.animate;

/**
 *
 * @author Jude Kikuyu
 */
public class CalcAreaThread extends Thread{
   private Thread t, t1, t2, t3;
   private String threadName;
   static CalcAreaThread cat =null;
   
   public void calcArea(){
       
   }
   public void divideArea(){
       
   }
   public void sumArea(){
       
   }
   public static void main(String[] args ){
       
        Thread divAreaThread = new Thread() {
                public void run() {
                    cat.divideArea();
            }
        };
        Thread calcAreaThread = new Thread() {
              public void run() {
                    cat.calcArea();
            }
        };
        Thread sumAreaThread = new Thread() {
              public void run() {
                    cat.sumArea();
            }
        };

        divAreaThread.start();
        calcAreaThread.start();
        sumAreaThread.start();
    }
}
