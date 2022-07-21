package com.gradle.code;

import java.util.*;

class Floor extends Room{
    int floor_id;
    int floor_level;
    List<Room> room;

    Floor(){

    }

    public Floor(int floor_id){
        this.floor_id = floor_id;
    }
}
