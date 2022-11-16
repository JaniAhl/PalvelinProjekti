package PalvelinProjekti.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface HourRepository extends CrudRepository<shiftHour, Long>{
	
	List<shiftHour> findByShiftId(Long shiftId);
}
