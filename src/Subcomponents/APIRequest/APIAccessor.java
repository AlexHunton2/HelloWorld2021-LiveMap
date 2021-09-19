package Subcomponents.APIRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class APIAccessor {
    public static final String url = "http://5271-128-210-106-73.ngrok.io/AlexH";
    HttpURLConnection connection = null;

    public JSONObject getEvents(String event) throws IOException, JSONException {
        URL url = new URL(APIAccessor.url + "?event=" + event);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //print in String
        System.out.println(response.toString());
        //Read JSON response and print
        String result = response.toString().substring(1);
        result = result.substring(0, result.length()-1);
        System.out.println(result );
        JSONObject myResponse = new JSONObject();
        return myResponse;
    }
}
