package com.anna.hoteldatarest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "T_ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "A_ROOM_ID")
    private Long id;

    @Size(max = 1)
    @Column(name = "A_ROOM_PLACE_COUNT")
    private byte placesCount;

    @Column(name = "A_ROOM_AREA")
    private Double area;

    @Column(name = "A_ROOM_PRICE")
    private Integer price;

    @Size(max = 200)
    @Column(name = "A_ROOM_IMG")
    private String img;

    @Column(name = "A_ROOM_DESC")
    private String description;

    @Size(max = 20)
    @Column(name = "A_ROOM_TYPE")
    @Enumerated(value = EnumType.STRING)
    private RoomType type;

//    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    private List<OrderEntity> history;
}
