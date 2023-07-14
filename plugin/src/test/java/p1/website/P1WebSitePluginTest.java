/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package p1.website;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A simple unit test for the 'p1.website.greeting' plugin.
 */
class P1WebSitePluginTest {
    @Test void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("p1.website.greeting");

        // Verify the result
        assertNotNull(project.getTasks().findByName("greeting"));
    }
}
