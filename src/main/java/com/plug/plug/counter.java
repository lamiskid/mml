package com.plug.plug;

import java.util.List;
import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * Counts the number of maven dependencies of a project.
 * <p>
 * It can be filtered by scope.
 */
@Mojo(name = "dependency-counter", defaultPhase = LifecyclePhase.COMPILE)
public class counter extends AbstractMojo {

    /**
     * Scope to filter the dependencies.
     */
    @Parameter(property = "scope")
    String scope;

    /**
     * Gives access to the Maven project information.
     */
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    public void execute() throws MojoExecutionException, MojoFailureException {
      //  runJaCoCoAnalysis();
        List<Dependency> dependencies = project.getDependencies();

        long numDependencies = dependencies.stream()
                                           .filter(d -> (scope==null || scope.isEmpty()) || scope.equals(d.getScope()))
                                           .count();

        getLog().info("Number of dependencies: " + numDependencies);
    }



    private void runJaCoCoAnalysis() throws MojoExecutionException {

        //  String jacocoCommand = "mvn jacoco:prepare-agent jacoco:report -Djacoco.destFile=" + jacocoReportsDirectory + "/jacoco.xml";
        String jacocoCommand = "mvn jacoco:prepare-agent jacoco:report";
        try {
            Process process = Runtime.getRuntime().exec(jacocoCommand);
            process.waitFor(); // Wait for the process to finish
        } catch (Exception e) {
            throw new MojoExecutionException("Failed to run JaCoCo analysis", e);
        }
    }

}