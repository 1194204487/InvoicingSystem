package com.pinker.entity;

public class Sale {
  private Long id;
  private Double price;
  private Long quantity;
  private Double totalprice;
  private java.sql.Date saledate;
  private Long userid;
  private Long productid;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Double getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(Double totalprice) {
    this.totalprice = totalprice;
  }

  public java.sql.Date getSaledate() {
    return saledate;
  }

  public void setSaledate(java.sql.Date saledate) {
    this.saledate = saledate;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }
}
