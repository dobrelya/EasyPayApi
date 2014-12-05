package com.cn.easypay.action;

import javax.annotation.Resource;

import com.cn.easypay.service.BaseService;

public class BaseAction<T>
{
	//@Resource
	private BaseService<T> baseService;

	public int add(T t)
	{
		return baseService.add(t);
	}
}
