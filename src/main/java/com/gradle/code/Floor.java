package com.gradle.code;

import java.util.*;

class Floor {
    int floor_id;
    int floor_level;
    HashMap<Integer, Room> rooms;

    Floor(){

    }

    public Floor(int floor_id, int floor_level){
        this.floor_id = floor_id;
        this.floor_level = floor_level;
    }

    void addRoom(int roomID){
        this.rooms.putIfAbsent(roomID, new Room(roomID));
    }
}
