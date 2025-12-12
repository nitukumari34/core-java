public class bankMain {
    public  static  void  main(String[]args){
        BankAccount sbi=new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(200);
            }
        };
//        bankAccount.withdraw(2000);
        Thread t1=new Thread(task,"Thread1");
        Thread t2=new Thread(task,"Thread2");
        t1.start();
        t2.start();

        System.out.println("Testing");

        for(int i=0;i<10;i++){
            System.out.println("hello");
        }
    }
}
