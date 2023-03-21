package hello.upload.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;
    private MultipartFile file;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
