public class Nitu extends  Thread {
  private  Counter counter;



    public synchronized void  increment(){
      this.counter=counter;

  }


    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.increment();
        }

    }

}
