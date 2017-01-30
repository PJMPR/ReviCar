package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SellerDto {

	private int id;
	private String name;
	private String surname;
	private int tel_number;
	private String mail;
	private String town;
	private String post_code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTel_number() {
		return tel_number;
	}
	public void setTel_number(int tel_number) {
		this.tel_number = tel_number;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	
}
