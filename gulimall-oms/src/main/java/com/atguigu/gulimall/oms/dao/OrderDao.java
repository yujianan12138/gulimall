package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yjn
 * @email yjn@atguigu.com
 * @date 2019-08-01 20:18:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
