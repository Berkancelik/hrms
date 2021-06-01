package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdversitements;

public interface JobAdvertisementsDao extends JpaRepository<JobAdversitements, Integer> {
	
	@Query("From JobAdvertisements where isOpen = true")
	List<JobAdversitements> getAllOpenJobAdversitementsList();
	
	@Query("From JobAdvertisements where isOpen = true Order By publishedAt Desc")
	List<JobAdversitements> findAllByOrderByPublishedAtDesc();
	
	@Query("From JobAdvertisements where isOpen = true and employer_id =:id")
	List<JobAdversitements> getAllOpenJobAdversitementsByEmployer(int id);

}