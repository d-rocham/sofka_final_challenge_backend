package org.backend.business.gateways;

import co.com.sofka.domain.generic.DomainEvent;

public interface EventBus {

    void publish(DomainEvent event);
    void publishError(Throwable errorEvent);
}
