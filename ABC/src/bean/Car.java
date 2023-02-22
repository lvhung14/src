package bean;

public class Car {
	private String serial;
	private String model;
	private String color;
	
	public Car(){
		
	}
	public Car(String serial, String model, String color) {
		this.model = model;
		this.serial = serial;
		this.color = color;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return serial + ", " + model + ", " + color;
	}
}
