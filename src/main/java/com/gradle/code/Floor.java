package com.gradle.code;

import java.util.*;

class Floor {
    int floorID;
    int floorLevel;
    HashMap<Integer, Room> rooms;

    Floor(){

    }

    public Floor(int floor_id){
        this.floorID = floor_id;
        rooms = new HashMap<>();
    }

    int getFloorID(){
        return this.floorID;
    }

    void setFloorID(int floorID){
        this.floorID = floorID;
    }

    int getFloorLevel(){
        return this.floorLevel;
    }

    void setFloorLevel(int floorLevel){
        this.floorLevel = floorLevel;
    }

    void addRoom(int roomID){
        this.rooms.putIfAbsent(roomID, new Room(roomID));
    }
}
