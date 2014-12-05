package com.cn.easypay.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.easypay.dao.HotelDao;
import com.cn.easypay.entity.HotelEntity;
import com.cn.easypay.service.HotelService;

@Repository("hotelService")
public class HotelServiceImpl implements HotelService<HotelEntity>
{
	@Resource
	private HotelDao<HotelEntity> hotelDao;
	
	@Override
	public int add(HotelEntity t)
	{
		return hotelDao.add(t);
	}

	@Override
	public int delete(HotelEntity t)
	{
		return 0;
	}

	@Override
	public int update(HotelEntity t)
	{
		return 0;
	}

	@Override
	public List<HotelEntity> getEntityById(int id)
	{
		return null;
	}

	@Override
	public HotelEntity getEntityByColumnName(String name)
	{
		return null;
	}

}
