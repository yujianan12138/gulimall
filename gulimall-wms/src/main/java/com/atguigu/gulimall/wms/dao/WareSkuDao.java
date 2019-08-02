package com.atguigu.gulimall.wms.dao;

import com.atguigu.gulimall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yjn
 * @email yjn@atguigu.com
 * @date 2019-08-01 20:36:42
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
