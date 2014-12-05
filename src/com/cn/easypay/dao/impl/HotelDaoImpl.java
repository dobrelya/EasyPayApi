package com.cn.easypay.dao.impl;

import org.springframework.stereotype.Repository;

import com.cn.easypay.dao.HotelDao;
import com.cn.easypay.entity.HotelEntity;

@Repository("hotelDaoImpl")
public class HotelDaoImpl implements HotelDao<HotelEntity>
{

	@Override
	public int add(HotelEntity t)
	{
		return 0;
	}
}
