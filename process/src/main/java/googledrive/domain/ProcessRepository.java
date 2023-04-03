package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "processes", path = "processes")
public interface ProcessRepository
    extends PagingAndSortingRepository<Process, Long> {}
