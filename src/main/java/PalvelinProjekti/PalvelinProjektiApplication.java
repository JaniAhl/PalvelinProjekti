package PalvelinProjekti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import PalvelinProjekti.domain.HourRepository;
import PalvelinProjekti.domain.ShiftMonth;
import PalvelinProjekti.domain.MonthRepository;
import PalvelinProjekti.domain.shiftHour;


@SpringBootApplication
public class PalvelinProjektiApplication {
	
	@Autowired HourRepository hourRepository;
	
	@Autowired MonthRepository monthRepository;
	


	public static void main(String[] args) {
		SpringApplication.run(PalvelinProjektiApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner shiftHours(HourRepository hourRepository, MonthRepository monthRepository) {
		return (args) -> {
			
			// Create all months to "month"
			ShiftMonth month1 = new ShiftMonth("January");
			monthRepository.save(month1);
			ShiftMonth month2 = new ShiftMonth("February");
			monthRepository.save(month2);
			ShiftMonth month3 = new ShiftMonth("March");
			monthRepository.save(month3);
			ShiftMonth month4 = new ShiftMonth("April");
			monthRepository.save(month4);
			ShiftMonth month5 = new ShiftMonth("May");
			monthRepository.save(month5);
			ShiftMonth month6 = new ShiftMonth("June");
			monthRepository.save(month6);
			ShiftMonth month7 = new ShiftMonth("July");
			monthRepository.save(month7);
			ShiftMonth month8 = new ShiftMonth("August");
			monthRepository.save(month8);
			ShiftMonth month9 = new ShiftMonth("September");
			monthRepository.save(month9);
			ShiftMonth month10 = new ShiftMonth("October");
			monthRepository.save(month10);
			ShiftMonth month11 = new ShiftMonth("November");
			monthRepository.save(month11);
			ShiftMonth month12 = new ShiftMonth("December");
			monthRepository.save(month12);
			
			// Few examples for the table
			
			hourRepository.save(new shiftHour(22, month1, 9.00, 17.00));
			hourRepository.save(new shiftHour(15, month1, 9.00, 17.00));
			hourRepository.save(new shiftHour(8, month2, 6.00, 19.00));
			hourRepository.save(new shiftHour(29, month3, 8.00, 16.00));
		};
	}

}
