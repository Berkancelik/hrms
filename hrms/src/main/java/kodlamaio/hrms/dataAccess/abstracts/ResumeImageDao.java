package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ResumeImage;

public interface ResumeImageDao extends JpaRepository<ResumeImage, Integer>{
	ResumeImage getById(int id);

	
}