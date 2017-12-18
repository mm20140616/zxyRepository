/**
 * @(#)HibernateUtil.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	赵晓宇  2017年12月13日
 */
package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * TODO 填写功能说明
 * @author 赵晓宇
 */
public class HibernateUtil {

	private static SessionFactory factory;
	
	static{
		//工人
		Configuration cfg = new Configuration();
		//图纸
		cfg.configure();//默认读取src下的cfg.xml文件
		//创建工厂（在5版本之前需要注册）
		factory = cfg.buildSessionFactory();
	}
	
	public static Session getSession(){
		return factory.openSession();
	}
	
}
