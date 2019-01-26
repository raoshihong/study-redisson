package com.rao.study.test;

import com.rao.study.redisson.utils.HttpClientUtils;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class TestRedis {

    @Test
    public void test(){

        final CountDownLatch downLatch = new CountDownLatch(1);

        CountDownLatch downLatch1 = new CountDownLatch(1);

        for(int i=0;i<3000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        downLatch.await();//都等待

                        HttpClientUtils.doGet("http://localhost:8080/testRedisson");

                    }catch (Exception e){

                    }

                }
            }).start();
        }

        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }

        downLatch.countDown();
       try{
           downLatch1.await();
       }catch (Exception e){

       }
    }

}
