package car.location.car;

import java.util.Date;

public class Taxes {
	
	int      idTaxes;
	double   price;
	Date 	 dateStart;
	Date 	 dateEnd;
	boolean  state;
	public int getIdTaxes() {
		return idTaxes;
	}
	public void setIdTaxes(int idTaxes) {
		this.idTaxes = idTaxes;
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
	
	

}
