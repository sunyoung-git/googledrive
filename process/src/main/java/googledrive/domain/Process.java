package googledrive.domain;

import googledrive.ProcessApplication;
import googledrive.domain.Fileprocessed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Process_table")
@Data
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Fileprocessed fileprocessed = new Fileprocessed(this);
        fileprocessed.publishAfterCommit();
    }

    public static ProcessRepository repository() {
        ProcessRepository processRepository = ProcessApplication.applicationContext.getBean(
            ProcessRepository.class
        );
        return processRepository;
    }

    public static void process(Fileuploaded fileuploaded) {
        /** Example 1:  new item 
        Process process = new Process();
        repository().save(process);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileuploaded.get???()).ifPresent(process->{
            
            process // do something
            repository().save(process);


         });
        */

    }
}
