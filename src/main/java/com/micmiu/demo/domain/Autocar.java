package com.micmiu.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/1/2018
 * Time: 16:51
 */
@Entity
@Table(name = "T_DEMO_AUTOCAR")
public class Autocar {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "MODEL")
	private String model;

	@Column(name = "CAR_TYPE")
	private String carType;

	@Column(name = "CAR_SUB_TYPE")
	private String carSubType;

	@Column(name = "PRODUCTION_DATE")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date productionDate;

	@Column(name = "PRICE")
	private Double price;

	@Column(name = "NOTES")
	private String notes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
