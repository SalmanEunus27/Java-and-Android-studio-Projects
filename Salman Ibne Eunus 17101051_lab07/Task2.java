 @author 17101051
 */
public class Task2 implements Runnable{
     public void run(){
     for(int i = 0;i<10;i++){
       System.out.println(Thread.currentThread().getId()+" Value "+i);
       try{
        Thread.sleep(1000);
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }
     }
    }

    
    
}