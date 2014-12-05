package com.cn.tfb.mapper;

import org.apache.ibatis.annotations.Select;

import com.cn.tfb.entity.HotelEntity;

public interface HotelMapper
{
	@Select("select * from ctrip_hotel where id=#{id}")
	HotelEntity getHotelById(int id);
}
