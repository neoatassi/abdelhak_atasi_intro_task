import com.gradle.code.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {
    ProjectServiceImp manager;

    @BeforeEach
    void setUp(){
        manager = new ProjectServiceImp();
    }

    @Test
    void testCreateProject(){
        Project testProject = manager.createProject("1st project");
        assertNotNull(manager);
        int projectID = manager.getProjectID(testProject);
        assertEquals(0, projectID);
    }

    @Test
    void testAddFloorToProject(){
        Project testProject = manager.createProject("Test project");
        int projectId = manager.getProjectID(testProject);
        manager.addFloorToProject(projectId);

        assertEquals(2, testProject.getFloors().size());
    }





}
