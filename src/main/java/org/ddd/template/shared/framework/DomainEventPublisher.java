package org.ddd.template.shared.framework;

import org.springframework.context.ApplicationEventPublisher;

public class DomainEventPublisher<T extends EventBase> {

    private ApplicationEventPublisher applicationEventPublisher;

    public DomainEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishEvent(T event) {
        applicationEventPublisher.publishEvent(event);
    }

}
