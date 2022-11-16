package PalvelinProjekti.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MonthRepository extends CrudRepository<ShiftMonth, Long>{
	List<ShiftMonth> findByshiftMonth(String shiftMonth);
}
