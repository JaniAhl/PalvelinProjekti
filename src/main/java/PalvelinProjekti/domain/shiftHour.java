package PalvelinProjekti.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
public class shiftHour {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // Generates ID automatically
	private long shiftId;
	private int shiftDay;
	private double shiftStart;
	private double shiftEnd;
	

	
	@ManyToOne() 
	@JoinColumn(name = "shiftMonthId")
	private ShiftMonth shiftMonth;

	// Constructors
	
	public shiftHour() {
		
	}
	

	public shiftHour(int shiftDay, ShiftMonth shiftMonth, double shiftStart, double shiftEnd) {
		super();
		this.shiftDay = shiftDay;
		this.shiftMonth = shiftMonth;
		this.shiftStart = shiftStart;
		this.shiftEnd = shiftEnd;
	}


	// Getters & Setters

	public long getShiftId() {
		return shiftId;
	}


	public void setShiftId(long shiftId) {
		this.shiftId = shiftId;
	}


	public int getShiftDay() {
		return shiftDay;
	}


	public void setShiftDay(int shiftDay) {
		this.shiftDay = shiftDay;
	}
	
	public ShiftMonth getShiftMonth() {
		return shiftMonth;
	}
	
	public void setShiftMonth(ShiftMonth shiftMonth) {
		this.shiftMonth = shiftMonth;
	}


	public double getShiftStart() {
		return shiftStart;
	}


	public void setShiftStart(double shiftStart) {
		this.shiftStart = shiftStart;
	}


	public double getShiftEnd() {
		return shiftEnd;
	}


	public void setShiftEnd(double shiftEnd) {
		this.shiftEnd = shiftEnd;
	}


	@Override
	public String toString() {
		return "shiftHour [shiftId=" + shiftId + ", shiftDay=" + shiftDay + ", shiftStart=" + shiftStart + ", shiftEnd="
				+ shiftEnd + ", shiftMonth=" + shiftMonth + ", getShiftId()=" + getShiftId() + ", getShiftDay()="
				+ getShiftDay() + ", getShiftMonth()=" + getShiftMonth() + ", getShiftStart()=" + getShiftStart()
				+ ", getShiftEnd()=" + getShiftEnd() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	


	
}	