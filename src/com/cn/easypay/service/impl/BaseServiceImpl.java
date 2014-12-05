package com.cn.easypay.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.cn.easypay.dao.BaseDao;
import com.cn.easypay.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T>
{
	@Resource
	private BaseDao<T> baseDao;

	@Override
	public int add(T t)
	{
		return baseDao.add(t);
	}

	@Override
	public int delete(T t)
	{
		return 0;
	}

	@Override
	public int update(T t)
	{
		return 0;
	}

	@Override
	public List<T> getEntityById(int id)
	{
		return null;
	}

	@Override
	public T getEntityByColumnName(String name)
	{
		return null;
	}

}
