package com.gradle.code;

import java.util.*;

public interface Service {

    void createProject(String name);

    //void createProject(int id);

    void createProject(Project project);

    void addFloorToProject(String projectName);

    void addFloorToProject(int projectId);

    void removeFloorFromProject(int projectID, int floorId);

   // void removeFloorFromProject(int floorId);

  //  Floor getFloor(String projectName, int floorLevel);

    Floor getFloor(int projectId, int floorID);

   // List<Floor> getFloors(String projectName);

    HashMap<Integer, Floor> getFloors(int projectId);

   // void addRoomToFloor(String projectName, int floorLevel);

    void addRoomToFloor(int projectId, int floorID);

 //   void addRoomToFloor(int floorId);

   // Room getRoom(String projectName, int floorLevel, int roomId);

    Room getRoom(int projectId, int floorID, int roomId);

  //  List<Room> getRooms(String projectName, int floorLevel);

    HashMap<Integer, Room> getRooms(int projectId, int floorID);

    void addMediaToRoom(int projectID, int floorID, int roomId, String input);

    List<String> getMediaOfRoom(int projectID, int floorID, int roomID);

}
