package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.Language;

@Repository
public interface LanguageDao extends JpaRepository<Language, Integer> {
	Language getById(int id);

}