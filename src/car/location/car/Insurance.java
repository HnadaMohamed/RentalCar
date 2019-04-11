package car.location.car;

import java.util.Date;

public class Insurance {
	
	int      idInsurance;
	String   type;
	double   price;
	Date 	 dateStart;
	Date 	 dateEnd;
	public int getIdInsurance() {
		return idInsurance;
	}
	public void setIdInsurance(int idInsurance) {
		this.idInsurance = idInsurance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	boolean  state;
	

}
