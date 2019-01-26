package com.rao.study.redisson.utils;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;

public class SimpleLock {

    private RLock rLock;
    private String lockKey;
    private long waitTime = 60;
    private long lessTime = 60;
    private TimeUnit timeUnit = TimeUnit.SECONDS;

    public RedissonClient getClient(){
        return SpringContextHolder.getBean(RedissonClient.class);
    }

    public SimpleLock(String lockKey){
        this.lockKey = lockKey;
        rLock = getClient().getLock(lockKey);
    }

    public SimpleLock(String lockKey,long waitTime){
        this(lockKey);
        this.waitTime = waitTime;
    }

    public SimpleLock(String lockKey,long waitTime,long lessTime){
        this(lockKey,waitTime);
        this.lessTime = lessTime;
    }

    public void lock(){
        rLock.lock(lessTime,timeUnit);
    }

    public boolean tryLock(){
        try{
            rLock.tryLock(waitTime,lessTime,timeUnit);
            return true;
        }catch (InterruptedException e){

        }
        return false;
    }

    public void unlock(){
        if(rLock!=null){
            rLock.unlock();
        }
    }
}
