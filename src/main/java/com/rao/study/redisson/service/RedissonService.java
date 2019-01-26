package com.rao.study.redisson.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rao.study.redisson.mapper.UserRechargeMapper;
import com.rao.study.redisson.po.UserRecharge;
import com.rao.study.redisson.utils.SimpleLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedissonService {

    @Autowired
    private UserRechargeMapper userRechargeMapper;

    public void testRedisson(){

        SimpleLock lock = new SimpleLock("myKey");

        lock.lock();

        UserRecharge userRecharge = userRechargeMapper.selectOne(new QueryWrapper<UserRecharge>().eq("id","1"));
        Double money = userRecharge.getMoney();
        money++;
        userRecharge.setMoney(money);
        userRechargeMapper.updateById(userRecharge);

        System.out.println(Thread.currentThread().getName());

        lock.unlock();
    }
}
