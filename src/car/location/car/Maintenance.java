package car.location.car;

import java.math.BigDecimal;

public class Maintenance {

	public int getIdMaintenance() {
		return idMaintenance;
	}
	public void setIdMaintenance(int idMaintenance) {
		this.idMaintenance = idMaintenance;
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	int  		idMaintenance;
	int  		idCar;
	BigDecimal  Amount;
	String 		description;
	
	
}
