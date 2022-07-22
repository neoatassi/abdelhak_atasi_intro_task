package com.gradle.code;

import java.util.*;

public interface Service {

    void createProject(String name);

    void createProject(int id);

    void createProject(Project project);

    void addFloorToProject(String projectName);

    void addFloorToProject(int projectId);

    void removeFloorFromProject(String projectName, int floorId);

    void removeFloorFromProject(int floorId);

    Floor getFloor(String projectName, int floorLevel);

    Floor getFloor(int projectId, int floorLevel);

    List<Floor> getFloors(String projectName);

    List<Floor> getFloors(int projectId);

    void addRoomToFloor(String projectName, int floorLevel);

    void addRoomToFloor(int projectId, int floorLevel);

    void addRoomToFloor(int floorId);

    Room getRoom(String projectName, int floorLevel, int roomId);

    Room getRoom(int projectId, int floorLevel, int roomId);

    List<Room> getRooms(String projectName, int floorLevel);

    List<Room> getRooms(int projectId, int floorLevel);

    void addMediaToRoom(int roomId);

    List<String> getMediaOfRoom(int roomId);

}
