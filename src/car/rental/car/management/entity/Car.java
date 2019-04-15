package car.rental.car.management.entity;

public class Car {
	
	int    idCar;
	String matricule;
	String color;
	String model;
	double priceDay;
	double power;
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPriceDay() {
		return priceDay;
	}
	public void setPriceDay(double priceDay) {
		this.priceDay = priceDay;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	


}
