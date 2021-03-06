package com.niit.bikes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Product1")
public class ProductModel { 
	
	@Column
		private String productname;
	@Id
	@Column
	private int productid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	@Column
	private String productsize;
	@Column
	private String productprice;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/*public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}*/
	public String getProductsize() {
		return productsize;
	}
	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
}


