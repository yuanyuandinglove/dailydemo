package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class lockTest {
    public lockTest() {
    }

    public  static  void main(String[] args){
        boolean lockTest = true;
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();



        try {
            lock.lock();

            System.out.println(Boolean.TRUE.equals(true));
            while (lockTest){
                System.out.print(666);
                condition.await();

            }

            System.out.print(7777);

        }catch (Exception ex){

        }finally {
            System.out.print(9);
            lock.unlock();
        }
         System.out.print(8);

    }
}
