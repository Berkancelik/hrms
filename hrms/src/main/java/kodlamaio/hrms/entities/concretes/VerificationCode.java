package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "verification_codes")

public class VerificationCode{
	@Id
	@GeneratedValue()
	@Column(name="id")
	private int id;

	@Column(name = "code")
	private String code;

	@Column(name = "is_confirmed")
	private boolean isConfirmed;
	
	@Column(name = "user_id")
	private int userId;
	
	@JsonIgnore
	@Column(name= "is_active")
	private boolean isActive = true;
	
	@JsonIgnore
	@Column(name= "is_deleted")
	private boolean isDeleted = false;
	
	@Column(name = "created_at")
	private LocalDate createdAt = LocalDate.now();
	
	public VerificationCode(int userId, String code, boolean isConfirmed, LocalDate createdAt) {
		super();
		this.userId = userId;
		this.code = code;
		this.isConfirmed = isConfirmed;
		this.createdAt = createdAt;
		
	}
	
	
	



}
