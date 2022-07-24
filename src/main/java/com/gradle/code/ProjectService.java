package com.gradle.code;

public interface ProjectService {
    Project createProject(String name);

    Project createProject(Project project);

    int getProjectID(Project project);

    void removeProject(int projectID);

    void addFloorToProject(Project project);

    void addFloorToProject(int projectID);

    void removeFloor(Project project);

    void removeFloor(int projectId);
}
