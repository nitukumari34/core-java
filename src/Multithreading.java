public class Multithreading {

  public  static void main(String[]args){
//
//      System.out.println("Hello!");
//      System.out.println(Thread.currentThread().getName());
      World world= new World();//new State
     Thread t1=new Thread(world);
     t1.start();//Runnable waiting for cpu free

      for(int i=0;i<100000;i++){
          System.out.println("Hello");
      }
  }
}
