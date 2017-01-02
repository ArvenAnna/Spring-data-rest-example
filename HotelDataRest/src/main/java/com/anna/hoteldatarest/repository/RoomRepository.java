package com.anna.hoteldatarest.repository;

import com.anna.hoteldatarest.entity.Room;
import com.anna.hoteldatarest.entity.RoomType;
import com.anna.hoteldatarest.entity.RoomTypeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface RoomRepository extends JpaRepository<Room, Long> {

//    @Query("select distinct room.type from Room room")
//    List<RoomTypeProjection> findDistinctRoomType();

    // http://localhost:8080/api/rooms/search/byType?type=LUX
    @RestResource(path="byType")
    List<Room> findByType(@Param("type") RoomType roomType);
}
