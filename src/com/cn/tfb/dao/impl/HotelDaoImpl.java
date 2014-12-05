package com.cn.tfb.dao.impl;

import com.cn.tfb.dao.HotelDao;
import com.cn.tfb.entity.HotelEntity;
import com.cn.tfb.mapper.HotelMapper;

public class HotelDaoImpl implements HotelDao
{
	private HotelMapper hotelMapper;

	public void setHotelMapper(HotelMapper hotelMapper)
	{
		this.hotelMapper = hotelMapper;
	}

	public HotelEntity getHotelById(int id)
	{
		return hotelMapper.getHotelById(id);
	}
}
