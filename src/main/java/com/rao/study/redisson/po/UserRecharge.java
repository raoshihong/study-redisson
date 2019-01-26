package com.rao.study.redisson.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "t_user_recharge") //如果表明不同则需要使用@TableName
public class UserRecharge {
    @TableId(value = "id",type = IdType.AUTO)//如果id是自增长的,则必须要使用@TableId指明IdType为AUTO
    private Integer id;

    private String token;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "UserRecharge{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
