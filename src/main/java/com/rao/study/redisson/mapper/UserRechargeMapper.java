package com.rao.study.redisson.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rao.study.redisson.po.UserRecharge;

//只需要创建自己的mapper继承Mybatis-plus的BaseMapper接口即可,不用写mapper.xml文件,也可以添加mapper.xml,在baseMapper中定义了很多有用的方法
//MapperScanner已经扫描这个接口了
public interface UserRechargeMapper extends BaseMapper<UserRecharge> {

}
