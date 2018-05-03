package com.itheima.springmvc.pojo;

import java.util.Date;

public class Item {
    private Integer id;

    private String name;

    private Double price;

    private String detail;

//    private String pic;

    private Date createtime;

    
	public Item(Integer id, String name, Double price, String detail,  Date createtime) {
		super();
		this.id = id;
		this.name = name;
		this.price =price;
		this.detail = detail;
		this.createtime = createtime;
	}

	public Item() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}



	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
    
}
