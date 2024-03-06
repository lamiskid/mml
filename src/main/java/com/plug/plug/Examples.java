package com.plug.plug;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Examples {


    public boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }

/*

    public void extractTest(){
        String sourceFolder = "target";  // Replace with your actual source folder
        String destinationFolder = "extracted_files";  // Replace with your desired destination folder

        // Create a File object for the source folder
        File sourceDirectory = new File("../../../target/site/jacoco/com.plug.plug/Examples.java.html");

        // Ensure that the source folder exists
        if (sourceDirectory.exists() && sourceDirectory.isDirectory()) {
            // Create a File object for the destination folder
            File destinationDirectory = new File(destinationFolder);

            // Create the destination folder if it doesn't exist
            if (!destinationDirectory.exists()) {
                destinationDirectory.mkdirs();
            }

            // Get a list of files in the source folder
            File[] files = sourceDirectory.listFiles();

            // Iterate through the files and copy them to the destination folder
            if (files != null) {
                for (File file : files) {
                    try {
                        Path sourcePath = file.toPath();
                        Path destinationPath = new File(destinationDirectory, file.getName()).toPath();

                        // Copy the file to the destination folder
                        Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

                        System.out.println("File extracted: " + file.getName());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("No files found in the source folder.");
            }
        } else {
            System.out.println("Source folder does not exist or is not a directory.");
        }
    }


*/

}
