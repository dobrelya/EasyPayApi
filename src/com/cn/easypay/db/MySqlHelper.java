package com.cn.easypay.db;

import org.apache.ibatis.session.SqlSessionFactory;

public class MySqlHelper
{
	private static SqlSessionFactory sessionFactory;

	public static SqlSessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
