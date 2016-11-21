package domain.model;

public class Offer {
	
	private int id;
	private String vehtype;
	private String make;
	private String model;
	private int year;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehtype() {
		return vehtype;
	}
	public void setVehtype(String vehtype) {
		this.vehtype = vehtype;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
}
