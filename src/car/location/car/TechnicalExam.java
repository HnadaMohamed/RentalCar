package car.location.car;

import java.math.BigDecimal;
import java.util.Date;

public class TechnicalExam {

	public int getIdTechnicalExam() {
		return idTechnicalExam;
	}
	public void setIdTechnicalExam(int idTechnicalExam) {
		this.idTechnicalExam = idTechnicalExam;
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
	public Date getDayStart() {
		return dayStart;
	}
	public void setDayStart(Date dayStart) {
		this.dayStart = dayStart;
	}
	public Date getDayEnd() {
		return dayEnd;
	}
	public void setDayEnd(Date dayEnd) {
		this.dayEnd = dayEnd;
	}
	int idTechnicalExam;
	int idCar ;
	BigDecimal Amount;
	Date dayStart;
	Date dayEnd;
	
	
}
