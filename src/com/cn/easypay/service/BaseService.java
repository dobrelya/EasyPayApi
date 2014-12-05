package com.cn.easypay.service;

import java.util.List;

public interface BaseService<T>
{
	int add(T t);

	int delete(T t);

	int update(T t);

	List<T> getEntityById(int id);

	T getEntityByColumnName(String name);

}
