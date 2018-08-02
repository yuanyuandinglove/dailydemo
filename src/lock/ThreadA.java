package lock;

public class ThreadA extends  Thread {
    private  Myservice myservice;
    public ThreadA(Myservice myservice) {
        super();
        this.myservice = myservice;
    }

    @Override
    public void run() {
       for (int i = 0 ; i < Integer.MAX_VALUE ; i ++){
           myservice.getValue();
       }
    }
}
