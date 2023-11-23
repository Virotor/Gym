package scripts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import scripts.model.Schedule;


@Repository
public interface ScheduleRepository  extends CrudRepository<Schedule, Integer>{
    
}
