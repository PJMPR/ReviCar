package domain.model;

import java.sql.Date;

public class Offer implements IHaveId {
	
	private int id;
	private String title;
	private String desc;
	private Date uploaded;
	private int seller_id;
	private int car_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getUploaded() {
		return uploaded;
	}
	public void setUploaded(Date uploaded) {
		this.uploaded = uploaded;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	
}
