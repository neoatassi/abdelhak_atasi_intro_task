package com.gradle.code;

import java.util.*;

abstract class Service extends Project{

    /**
     * Counters to initialize and declare IDs
     */
    int projectCounter = 0;
    int floorCounter = 0;
    int roomCounter = 0;

    /**
     * Hashmap of project entries and project names
     */
    public Map<String, Project> Projects = new HashMap<String, Project>();

    /**
     * Create a new Project with a name parameter
     * @param name
     */
    void createProject(String name)
    {
        Project newProject = new Project();
        Projects.put(name, newProject);
        newProject.project_id = projectCounter++;
    }

    /**
     * Create a new Project with no parameters
     */
    void createProject(){
        Project newProject = new Project();
        Projects.put("unnamed" ,newProject);
        newProject.project_id = projectCounter++;
    }

    void addProject(Project project, String project_name){
        Project newProject = project;
        Projects.putIfAbsent(project_name, newProject);
        newProject.project_id = projectCounter++;
    }

    void addFloorstoProject(String project_name, int floorAmount){
        for(int i = 0; i < floorAmount; i++) {
            Projects.get(project_name).floors.add(new Floor(floorCounter++));
        }
    }

    void addRoomsToFloor(String project_name, int floorLevel,int roomAmount){
        for(int i = 0; i < roomAmount; i++){
            Projects.get(project_name).floors.get(floorLevel).room.add(new Room(roomCounter++));
        }
    }

    void addMediaToRoom(String project_name, int floorLevel, int roomID, String media){

    }


}
