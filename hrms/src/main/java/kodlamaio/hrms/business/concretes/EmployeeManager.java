package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.JobExperience;
@Service
public class EmployeeManager implements EmployeeService{
	private EmployeeDao employeeDao;

	@Autowired
	public  EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	  @Override
	    public Result add(Employee employee) {
	        this.employeeDao.save(employee);
	        return new SuccessResult("Sistem kullanıcısı başarılı şekilde eklendi");
	    }
	
	
	@Override
	public DataResult<List<Employee>> getAll( ) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

	@Override
	public DataResult<Employee> getById(int id) {
		return new SuccessDataResult<Employee>(this.employeeDao.getById(id));

	}
	@Override
	public Result delete(int id) {
		this.employeeDao.deleteById(id);
		return new SuccessResult("Sistem çalışanı başarıyla silindi.");
	}

	@Override
	public Result update(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Sistem çalışanı başarıyla güncellendi.");
	}

}