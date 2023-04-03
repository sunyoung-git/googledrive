package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Fileprocessed extends AbstractEvent {

    private Long id;

    public Fileprocessed(Process aggregate) {
        super(aggregate);
    }

    public Fileprocessed() {
        super();
    }
}
