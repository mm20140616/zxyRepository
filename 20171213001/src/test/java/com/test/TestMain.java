/**
 * @(#)TestMain.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	赵晓宇  2017年12月13日
 */
package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;

import com.domain.Car;
import com.util.HibernateUtil;

/**
 * TODO 填写功能说明
 * @author 赵晓宇
 */
public class TestMain {

	@Test
	public void t1(){
		Car car = new Car(18,"奔驰","白色",300000);
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(car);
		session.getTransaction().commit();
	}
	
	@Test
	public void t2(){
		Car car = new Car(18,"奔驰","蓝色",800000);
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.update(car);
		session.getTransaction().commit();
	}
	
	@Test
	public void t3(){
		Car car = new Car(2,"zxy","red",1001);
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(car);
		session.getTransaction().commit();
	}
	@Test
	public void t4(){
		Session session = HibernateUtil.getSession();
		Car car = session.load(Car.class, 18);
		System.out.println(car.getCname());
	}
	
	@Test
	public void t5(){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("from Car");
		List list = query.list();
		System.out.println(list);
		
	}
	
	@Test
	public void t6(){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Car  where cno <?");
		query.setParameter(0, 18);
		query.executeUpdate();
		session.getTransaction().commit();
	}
	
}












