/**
 * @(#)Car.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	赵晓宇  2017年12月13日
 */
package com.domain;

import java.io.Serializable;

/**
 * TODO 填写功能说明
 * @author 赵晓宇
 */
public class Car implements Serializable{

	private static final long serialVersionUID = 5725167361278999525L;
	private Integer cno;
	private String cname;
	private String color;
	private Integer price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer cno, String cname, String color, Integer price) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.color = color;
		this.price = price;
	}
	/**
	 * @return the cno
	 */
	public Integer getCno() {
		return cno;
	}
	/**
	 * @param cno the cno to set
	 */
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
