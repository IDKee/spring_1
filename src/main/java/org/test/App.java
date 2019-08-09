package org.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Hello world!
 */
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("panjie");
    }

    @Test
    public void test1() {
        TestRunable testRunable = new TestRunable();
        new Thread(testRunable, "测试一").start();
        new Thread(testRunable, "测试二").start();
        System.out.println("panjie");
        logger.info("panjie");
    }

}

class TestThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i=" + i);
        }
    }
}

class TestThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("这个是i=" + i);
        }
    }

}

class TestRunable implements Runnable{

    private Integer t = 10;

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            if (t>0) {
                System.out.println(Thread.currentThread().getName() + "现存：" + this.t--);
            }
        }
    }
}
