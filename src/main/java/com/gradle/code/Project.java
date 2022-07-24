package com.gradle.code;

import java.util.*;

public class Project {
    String projectName;
    int projectId;
    HashMap<Integer, Floor> floors;

    /*
    Project (int project_id){
        this.project_id = project_id;
    }
    */


    Project(String name, int projectId){
        this.projectName = name;
        this.projectId = projectId;
        floors = new HashMap<>();
    }

    Project(Project project, int Id){
        this(project.projectName, project.projectId);
        this.projectId = Id;
        floors = new HashMap<>();
    }

    public void addFloor(int floorId){
        floors.putIfAbsent(floorId, new Floor(floorId));
    }

    public void removeFloor(int floorId){
        floors.remove(floorId);
    }

    public String getProjectName(){
        return this.projectName;
    }

    public void setProjectName(String name){
        this.projectName = name;
    }

    public int getProjectId(){
        return this.projectId;
    }

    public void setProjectId(int id){
        this.projectId = id;
    }

    public HashMap<Integer, Floor> getFloors(){
        return floors;
    }

    public void setFloors(HashMap<Integer, Floor> floors){
        this.floors = floors;
    }

}
