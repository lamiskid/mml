package com.plug.plug;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import java.io.IOException;
import java.net.URISyntaxException;


@Mojo(name = "hi", defaultPhase = LifecyclePhase.COMPILE)
public class jacoco  extends AbstractMojo {


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

       // runJaCoCoAnalysis();
        getLog().info("Running wei unit tests...");

        String command = "mvn surefire:test";
        try {
          //  Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            throw new MojoExecutionException("Failed to run tests", e);
        }


        try {
            ChatGpt.makeTest();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }






    private void runJaCoCoAnalysis() throws MojoExecutionException {
        getLog().info("Running yy  jacoco analysis;...");
    //    String jacocoCommand = "mvn jacoco:prepare-agent jacoco:report -Djacoco.destFile=" + jacocoReportsDirectory + "/jacoco.xml";
        String jacocoCommand = "mvn jacoco:prepare-agent jacoco:report";

        String [] commands= {jacocoCommand};
        try {
            Process process = Runtime.getRuntime().exec(commands);
            process.waitFor(); // Wait for the process to finish
        } catch (Exception e) {
            throw new MojoExecutionException("Failed to run JaCoCo analysis", e);
        }
    }
}

