package kodlamaio.hrms.core.utilities.imagaUpload;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;

public interface ImageService {
	DataResult<Map> uploadImageFile(MultipartFile imageFile);

}