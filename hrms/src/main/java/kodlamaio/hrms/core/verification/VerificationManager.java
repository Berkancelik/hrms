package kodlamaio.hrms.core.verification;

import java.util.UUID;

public class VerificationManager implements VerificationService {

	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Doğrulama bağlantısı şu adrese gönderildi:" + email );
		System.out.println("Lütfen hesabınızı doğrulamak için bağlantıya tıklayın:  " + verificationLink );
		
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Aktivasyon kodunuz:  " + verificationCode );
		return verificationCode;
	}

}
