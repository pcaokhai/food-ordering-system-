package com.food.ordering.system.order.service.domain.ports.output.repository.message.publisher.payment;

import com.food.ordering.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessageEventPublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
