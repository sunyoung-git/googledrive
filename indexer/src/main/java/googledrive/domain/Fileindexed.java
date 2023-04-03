package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Fileindexed extends AbstractEvent {

    private Long id;

    public Fileindexed() {
        super();
    }
}
