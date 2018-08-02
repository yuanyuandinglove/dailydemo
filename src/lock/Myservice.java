package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Myservice {
    private  ReentrantLock reentrantLock = new ReentrantLock();
    private Condition condition = reentrantLock.newCondition();


    public boolean hasValue = false;


    public void setValue(){

            try {
                reentrantLock.lock();
                while (hasValue) {
                    System.out.println("#");
                    condition.await();
                }
                System.out.println("1");
                hasValue = true;
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }finally {
                reentrantLock.unlock();
            }
        }



    public void getValue(){
        try {
            reentrantLock.lock();
            while (!hasValue) {
                System.out.println("*");
                condition.await();
            }
            System.out.println("2");
            hasValue = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }finally {
            reentrantLock.unlock();
        }
    }
}
