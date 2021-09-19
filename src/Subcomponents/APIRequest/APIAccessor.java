package Subcomponents.APIRequest;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class APIAccessor {
    public static final String url = "http://6764-128-210-106-73.ngrok.io/AlexH";
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

    public String insertEvent(String event, String message, String location, int time) throws IOException, JSONException {
        // https://stackoverflow.com/questions/1359689/how-to-send-http-request-in-java
        try {
            URL url = new URL(APIAccessor.url + "?event=" + event);
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);

            // Json Object Definition
            JSONObject json = new JSONObject();
            json.put("event", event);
            json.put("message", message);
            json.put("location", location);
            json.put("time", time);
            String fullData = json.toString();

            // Header Setup
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Content-Length", Integer.toString(fullData.length()));

            //Send request
            DataOutputStream wr = new DataOutputStream(
                    connection.getOutputStream());
            wr.close();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            // Return Error In Case of Failure
            return e.getMessage();
        } finally {
            // Disconenct
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
