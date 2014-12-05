package com.cn.easypay.mapper.impl;

import org.apache.ibatis.annotations.Select;

import com.cn.easypay.entity.HotelEntity;


public interface HotelMapper
{
	@Select("select * from ctrip_hotel where id=#{id}")
	int add(HotelEntity t);
}
