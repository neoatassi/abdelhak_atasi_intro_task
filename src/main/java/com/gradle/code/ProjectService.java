package com.gradle.code;
import com.gradle.code.exceptions.ProjectDoesNotExist;

import java.util.Map;

public interface ProjectService {
    Project createProject(String name);

    Project createProject(Project project);

    void removeProject (int projectID);

    Map<Integer, Project> getProjects();

    void printOutProjects();

    void addFloorToProject(Project project);

    void addFloorToProject(int projectID);

    void removeFloor(Project project, int level);

    void removeFloor(int projectId, int level);
}
