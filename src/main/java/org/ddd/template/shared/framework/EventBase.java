package org.ddd.template.shared.framework;

import java.util.Date;

public class EventBase {

    private Date occurredOn;

    private String sequenceId;

    public EventBase() {
        this.occurredOn = new Date();
    }

    public Date getOccurredOn() {
        return this.occurredOn;
    }

}
