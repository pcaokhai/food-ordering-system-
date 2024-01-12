package com.food.ordering.system.order.service.domain.valueObject;

import com.food.ordering.domain.valueObject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {

    public TrackingId(UUID value) {
        super(value);
    }
}
