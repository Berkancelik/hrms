package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkHour;



public interface WorkHourService {

	Result add(WorkHour workHour);
	
	DataResult<List<WorkHour>> getAll();
}