package lock;

public class TestThread {
    public static  void  main(String[] args){
        Myservice myservice = new Myservice();
        ThreadA  threadA = new ThreadA(myservice);
        ThreadB threadB = new ThreadB(myservice);
        threadA.start();
        threadB.start();
    }
}
