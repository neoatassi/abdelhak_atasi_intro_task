package com.gradle.code;

public interface FloorService {

    void addRoomToFloor(Project project, int floorLevel);

    void removeRoomFromFloor(Project project, int floorLevel, int roomId);
}
