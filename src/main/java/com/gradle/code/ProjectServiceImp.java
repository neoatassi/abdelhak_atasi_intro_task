package com.gradle.code;



import java.util.HashMap;
import java.util.Map;

public class ProjectServiceImp implements ProjectService {

    static int projectIdCounter = 0;
    static int floorIdCounter = 0;

    public Map<Integer, Project> Projects = new HashMap<Integer, Project>();

    /**
     * Create a project with a chosen name
     * @param name
     */
    @Override
    public Project createProject(String name) {
        Project newProject = new Project(name, projectIdCounter);
        Projects.putIfAbsent(projectIdCounter, newProject);
        addFloorToProject(floorIdCounter++);
        projectIdCounter++;
        return newProject;
    }

    /**
     *  Create a clone project with a new unique ID
     * @param project
     */
    @Override
    public Project createProject(Project project) {
        Project newProject = new Project(project.projectName, projectIdCounter);
        Projects.putIfAbsent(projectIdCounter, newProject);
        addFloorToProject(floorIdCounter++);
        projectIdCounter++;
        return newProject;
    }

    @Override
    public int getProjectID(Project project){
        return project.getProjectId();
    }

    /**
     * removes a project provided the id
     * @param projectID
     */
    @Override
    public void removeProject(int projectID){
        Projects.remove(projectID);
    }

    /**
     * adds a floor to a directly referenced project
     * @param project
     */
    @Override
    public void addFloorToProject(Project project) {
        floorIdCounter++;
        Floor tempFloor = new Floor(floorIdCounter);
        project.floors.putIfAbsent(floorIdCounter, tempFloor);
        tempFloor.setFloorLevel((int)project.floors.size() - 1);
    }

    /**
     * adds a floor to a project referenced by its ID
     * @param projectID
     */
    @Override
    public void addFloorToProject(int projectID){
        floorIdCounter++;
        Floor tempFloor = new Floor(floorIdCounter);
        Projects.get(projectID).floors.putIfAbsent(floorIdCounter, tempFloor);
        tempFloor.setFloorLevel((int)Projects.get(projectID).floors.size() - 1);
    }

    /**
     * removes a floor from a directly referenced project
     * @param project
     */
    @Override
    public void removeFloor(Project project){
        int lastEntry = project.floors.size() - 1;
        project.floors.remove(lastEntry);
    }

    /**
     * removes a floor from a project referenced by its ID
     * @param projectId
     */
    @Override
    public void removeFloor(int projectId){
        int lastEntry = Projects.get(projectId).floors.size() - 1;
        Projects.get(projectId).floors.remove(lastEntry);
    }

}
