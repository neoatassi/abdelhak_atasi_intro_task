package com.gradle.code;

import java.util.*;

class Project {
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
    }

    Project(Project project){
        this(project.projectName, project.projectId);
    }

    void addFloor(int floorId){
        floors.putIfAbsent(floorId, new Floor(floorId, floors.size()));
    }

    void removeFloor(int floorId){
        floors.remove(floorId);
    }

}
