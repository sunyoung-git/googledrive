package googledrive.domain;

import googledrive.DriveApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Upload_table")
@Data
public class Upload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static UploadRepository repository() {
        UploadRepository uploadRepository = DriveApplication.applicationContext.getBean(
            UploadRepository.class
        );
        return uploadRepository;
    }
}
