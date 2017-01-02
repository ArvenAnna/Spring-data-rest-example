package com.anna.hoteldatarest.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "roomTypes", types = { Room.class })
// http://localhost:8080/api/rooms/1?projection=roomTypes
public interface RoomTypeProjection {
    RoomType getType();
}
