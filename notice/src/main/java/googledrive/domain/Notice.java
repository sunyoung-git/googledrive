package googledrive.domain;

import googledrive.NoticeApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notice_table")
@Data
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static NoticeRepository repository() {
        NoticeRepository noticeRepository = NoticeApplication.applicationContext.getBean(
            NoticeRepository.class
        );
        return noticeRepository;
    }
}
