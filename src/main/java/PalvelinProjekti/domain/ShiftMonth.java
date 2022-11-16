package PalvelinProjekti.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ShiftMonth {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Generate ID automatically
	private Long shiftMonthId;
	private String shiftMonth;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "shiftMonth")
	
	private List<shiftHour> shiftHours;
	
	public ShiftMonth(String shiftMonth) {
		super();
		this.shiftMonth = shiftMonth;
	}
	
	// Constructors
	
	public ShiftMonth() {
		
	}
	
	// Getters & Setters

	public Long getShiftMonthId() {
		return shiftMonthId;
	}

	public void setShiftMonthId(Long shiftMonthId) {
		this.shiftMonthId = shiftMonthId;
	}

	public String getShiftMonth() {
		return shiftMonth;
	}

	public void setShiftMonth(String shiftMonth) {
		this.shiftMonth = shiftMonth;
	}

	public List<shiftHour> getHours() {
		return shiftHours;
	}

	public void setHours(List<shiftHour> shiftHours) {
		this.shiftHours = shiftHours;
	}
	

	
	
	
	

}
