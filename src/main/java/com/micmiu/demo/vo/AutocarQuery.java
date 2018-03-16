package com.micmiu.demo.vo;

import java.util.Date;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/5/2018
 * Time: 23:30
 */
public class AutocarQuery {

	private String brand;

	private String model;

	private String carType;

	private String carSubType;

	private Date productionDate;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarSubType() {
		return carSubType;
	}

	public void setCarSubType(String carSubType) {
		this.carSubType = carSubType;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
}
