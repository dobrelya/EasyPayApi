package com.cn.easypay.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.easypay.entity.HotelEntity;
import com.cn.easypay.service.HotelService;

@Repository("hotelAction")
public class HotelAction extends BaseAction<HotelEntity>
{
	//@Resource
	private HotelService<HotelEntity> hotelService;

	public int add(HotelEntity t)
	{
		return hotelService.add(t);
	}
}
