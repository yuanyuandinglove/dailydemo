package lock;

public class ThreadB extends  Thread {

    private  Myservice myservice;
    public ThreadB(Myservice myservice) {
        super();
        this.myservice = myservice;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < Integer.MAX_VALUE ; i ++){
            myservice.setValue();
        }
    }
}
