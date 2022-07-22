package com.gradle.code;

import java.util.*;

class Project_Service implements Service {

    /**
     * Counters to initialize and declare IDs
     */
    static int projectCounter = 0;
    static int floorCounter = 0;
    static int roomCounter = 0;

    /**
     * Hashmap of project entries with their unique IDs
     */
    public Map<Integer, Project> Projects = new HashMap<Integer, Project>();


    @Override
    public void createProject(String name) {
        Projects.putIfAbsent(projectCounter, new Project(name, projectCounter));
        projectCounter += 1000;
    }

    @Override
    public void createProject(Project project) {
        Projects.putIfAbsent(projectCounter, new Project(project));
        projectCounter += 1000;
    }

    @Override
    public void addFloorToProject(String projectName) {
        floorCounter += projectCounter;
      //  Projects.values(projectName).get
        floorCounter += 100;
    }

    @Override
    public void addFloorToProject(int projectId) {
        floorCounter += projectCounter + 100;
        Projects.get(projectId).addFloor(floorCounter);
    }

    @Override
    public void removeFloorFromProject(int projectID, int floorId) {
        Projects.get(projectID).removeFloor(floorId);
    }


    @Override
    public Floor getFloor(int projectId, int floorID) {
       return Projects.get(projectId).floors.get(floorID);
    }


    @Override
    public HashMap<Integer, Floor> getFloors(int projectId) {
        return Projects.get(projectId).floors;
    }


    @Override
    public void addRoomToFloor(int projectId, int floorID) {
        roomCounter += floorCounter + 10;
        Projects.get(projectId).floors.get(floorID).addRoom(roomCounter);
    }

    @Override
    public Room getRoom(int projectId, int floorID, int roomId) {
        return Projects.get(projectId).floors.get(floorID).rooms.get(roomId);
    }


    @Override
    public HashMap<Integer, Room> getRooms(int projectId, int floorID) {
        return Projects.get(projectId).floors.get(floorID).rooms;
    }

    @Override
    public void addMediaToRoom(int projectID, int floorID, int roomID, String input) {
        Projects.get(projectID).floors.get(floorID).rooms.get(roomID).media.add(input);
    }

    @Override
    public List<String> getMediaOfRoom(int projectID, int floorID, int roomID) {
        return Projects.get(projectID).floors.get(floorID).rooms.get(roomID).media;
    }

}
