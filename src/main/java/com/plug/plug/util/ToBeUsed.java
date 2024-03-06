package com.plug.plug.util;

import com.plug.plug.FileExtractor;
import com.plug.plug.model.ChatGPTRequest;
import com.plug.plug.model.ChatGptResponse;
import com.plug.plug.model.Messages;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ToBeUsed {
   /* public static String getClassesTobeTested() throws URISyntaxException {

        String extractReportContent = FileExtractor.getTextFromFile("target/site/jacoco/jacoco.xml");

        String prompt = "list  all the source file in the jacoco coverage with no additional word added and bullet or numbers"
                +"\n" +extractReportContent +"\n";

        Messages messages =new Messages("user",prompt);
        List<Messages> messagesList =new ArrayList<>();
        messagesList.add(messages);
        ChatGPTRequest gptRequest =new ChatGPTRequest("gpt-3.5-turbo",messagesList);


        ChatGptResponse chatGptResponse=makeOpenAIAPIRequest(gptRequest);
        String content= chatGptResponse.getChoices().get(0).getMessages().getContent();

        return content;
    }



    public static void writeTest() throws URISyntaxException, IOException {

        String allClasses =  getClassesTobeTested();


        List<String> classesList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new StringReader(allClasses));
        String line;

        // Read each line from the reader
        while ((line = reader.readLine()) != null) {
            classesList.add(line);
        }

        // Close the reader
        reader.close();


        for(String classes : classesList){
            testPromptRequest("target/site/jacoco/com.plug.plug/"+classes+".html",classes);
        }

    }

    public static void testPromptRequest(String location, String fileName) throws URISyntaxException, IOException {

        String htmlContent = FileExtractor.getTextFromFile(location);

        // Sanitize HTML using JSoup
        Document document = Jsoup.parse(htmlContent);
        String textContent = document.text();

        String prompt = "Write a unit  test  coverage for  this  jacoco report" +"\n" +textContent +"\n";


        Messages messages =new Messages("user",prompt);
        List<Messages> messagesList =new ArrayList<>();
        messagesList.add(messages);
        ChatGPTRequest gptRequest =new ChatGPTRequest("gpt-3.5-turbo",messagesList);


        ChatGptResponse chatGptResponse=makeOpenAIAPIRequest(gptRequest);

        String content= chatGptResponse.getChoices().get(0).getMessages().getContent();

        System.out.println(content);
        writeToFile(fileName,content);

    }*/


}
