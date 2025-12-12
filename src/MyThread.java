//public class MyThread extends  Thread {
//    @Override
//    public void run() {
//        System.out.println("RUNNING");
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public  static void  main (String[]args) throws InterruptedException {
//        MyThread t1=new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
//
//        System.out.println(Thread.currentThread().getState());
//
//        Thread.sleep(100);
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println(t1.getState());
//    }
//}

public class MyThread extends  Thread {
    public MyThread(Counter counter) {

    }
//    public  MyThread(String name ){
//         super(name);
//    }
//    @Override
//    public void run() {
//        System.out.println("thread is runninng");
//        for(int i=0;i<5;i++){
//            System.out.println(Thread.currentThread(). getName()+" - Priority: "+Thread.currentThread().getPriority() + " -count:"+i);
//            try{
//                Thread.sleep(100);
//            }catch (Exception e){
//
//            }
//        }
//@Override
//public void run() {
//     try{
//
//         Thread.sleep(1000);
//         System.out.println("thread is running");
//
//    }catch (Exception ex){
//         System.out.println("Thread Interrupted: " + ex);
//     }

    //yield
//    for(int i=0;i<4;i++){
//        System.out.println(Thread.currentThread().getName()+" is running");
//        Thread.yield();
//
//    }

    //yield setDaemon background me chalta h iska jvm wait nhi krta h, main thread khtm hoga then terminate ho jayega

//    while(true){
//        System.out.println("hello world!");
//    }
//    }

    public  static void  main (String[]args) throws InterruptedException {
//        MyThread t1=new MyThread();
//        t1.start();
//        t1.join();
//        System.out.println("hello");

//        MyThread l=new MyThread("Low priority thread");
//        MyThread M=new MyThread("Medium priority thread");
//        MyThread H=new MyThread("High priority thread");
//
//        l.setPriority(Thread.MIN_PRIORITY);
//        M.setPriority(Thread.NORM_PRIORITY);
//        H.setPriority(Thread.MAX_PRIORITY);
//        l.start();
//        M.start();
//        H.start();

        //Interrupt

//        MyThread t1=new MyThread();
//        t1.start();
//        t1.interrupt();//jo v kr rhe ho vahi pe rok do
//
        //yield
//        MyThread t1=new MyThread();
//        t1.start();
//        MyThread t2=new MyThread();
//        t2.start();

//        MyThread t1=new MyThread();
//        t1.setDaemon(true);
//
//        MyThread t2=new MyThread();
////        t2.start();
////        t1.start();
//        System.out.println("Main  Done!");


    }
}
