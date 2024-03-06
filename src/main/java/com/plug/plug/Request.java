package com.plug.plug;



/*
import com.plug.plug.model.ChatGPTRequest;
import com.plug.plug.model.Messages;
import feign.*;

import feign.gson.GsonEncoder;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Request {

*/


/*
    public static void main(String[] args) throws URISyntaxException, IOException {

        Gpt github = new Feign.Builder()
                .encoder(new GsonEncoder())
                .target(Gpt.class, "https://api.openai.com/v1/chat/completions");

        // Example request body
        String requestBody = "{\"prompt\": \"Hello, ChatGPT!\"}";
        String model  ="gpt-3.5-turbo";
       // String prompt ="hello";
        FileExtractor fileExtractor = new FileExtractor();


        String htmlContent = fileExtractor.getTextFromFile("");

        // Sanitize HTML using JSoup
        Document document = Jsoup.parse(htmlContent);
        String textContent = document.text();

        String prompt = textContent;

        StringEntity inputEntity = new StringEntity(prompt, ContentType.APPLICATION_JSON);
        String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + prompt + "\"}]}";

        Messages messages =new Messages("user",fileExtractor.getTextFromFile(""));
        List<Messages> messagesList =new ArrayList<>();
        messagesList.add(messages);
        ChatGPTRequest gptRequest =new ChatGPTRequest("gpt-3.5-turbo",messagesList);

       Object response = github.postRequest(gptRequest);

        System.out.println(response);



    }


}


*/


 /*   interface Gpt {
        @RequestLine("POST ")
        @Headers({"Content-Type: application/json", "Authorization: Bearer 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"})
        Object postRequest(ChatGPTRequest gptRequest);


    }
}
*/

