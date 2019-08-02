package com.atguigu.gulimall.ums.service;

import com.atguigu.gulimall.ums.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 会员等级
 *
 * @author yjn
 * @email yjn@atguigu.com
 * @date 2019-08-01 20:23:59
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageVo queryPage(QueryCondition params);
}

