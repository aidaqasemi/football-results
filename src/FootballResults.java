import javax.swing.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.URL;
import java.sql.Connection;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;  
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class FootballResults {
	String apiUrl;
	private String choice;

    public static void main(String[] args) {
        String leagueId = null;
		String apiUrl = "https://v3.football.api-sports.io/leagues"+leagueId;
        
    
        HttpURLConnection connection = fetchApiResponse(apiUrl);
        if (connection != null) {
            try {
                if (connection.getResponseCode() != 200) {
                    System.out.println("Sorry, could not connect to API");
                } else {
                    StringBuilder resultJson = new StringBuilder();
                    Scanner scanner = new Scanner(connection.getInputStream());
                    while (scanner.hasNextLine()) {
                        resultJson.append(scanner.nextLine());
                    }
                    scanner.close();
                    connection.disconnect();
                    
                    
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                connection.disconnect();
            }
        }
    }

   public static  String getLeagueData(String choice) {
		// TODO Auto-generated method stub
    	String leagueId="";
    	
    	switch(choice) {
    	case "Iranbtn":
    		
    	leagueId="https://v3.football.api-sports.io/leagues/285";
        break;
    	
    	
    	case "Germanybtn":
    		leagueId="https://v3.football.api-sports.io/leagues/78";
            break;
    	
    	case "Brazilbtn":
    		leagueId="https://v3.football.api-sports.io/leagues/142";
            break;
    	case "Italybtn":
    		leagueId="https://v3.football.api-sports.io/leagues/135";
            break;
    	case"Spainbtn":
    		leagueId="https://v3.football.api-sports.io/leagues/140";
            break;
    	case "Englandbtn":
    		leagueId="https://v3.football.api-sports.io/leagues/39";
            break;
            default:
            	System.out.println("error:(");
            	break;
            	
    	
    	
    	
    	} String apiUrl = "https://v3.football.api-sports.io/fixtures?league="+leagueId+"&season=2023";
    	
		HttpURLConnection connection=fetchApiResponse(apiUrl);
    	if(connection!=null) {
    		try  (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
            String jsonResponse = response.toString();
            System.out.println(jsonResponse); 
{
    			if(connection.getResponseCode() !=200) {
    				
    				System.out.println("error.could not connect to Api");
    				
    				
    			}else { StringBuilder resultJson=new StringBuilder();
    			Scanner scanner=new Scanner(connection.getInputStream());
    			while(scanner.hasNext()) {
    				
    				resultJson.append(scanner.nextLine());
    				
    			
    			}
    			scanner.close();
    			connection.disconnect();
    			return resultJson.toString();}
}
        }
    		}
       
catch(IOException e) {
    			
    			
    			e.printStackTrace();
    		}finally {
    			connection.disconnect();
    		}return "no data available";
    		
	
    		
    	}
    	
  
		return null;
	}

	private static JSONObject getFootballData() {
		// TODO Auto-generated method stub
		String choice =null;
String LeagueData=getLeagueData(choice);
		try {
			
			
			String apiUrl = null;
			HttpURLConnection connection=fetchApiResponse(apiUrl);
			if(connection.getResponseCode()!=200)
			{
			
			System.out.println("error.could not connect to Api:(");
			return null;
			}
			else {
				StringBuilder resultJson=new StringBuilder();
				Scanner scanner=new Scanner(connection.getInputStream());
				while (scanner.hasNext()) {
					
					
					resultJson.append(scanner.nextLine());
				}
				scanner.close();
				connection.disconnect();
				
				JSONParser parser=new JSONParser();
				
				JSONObject resultJsonObj=(JSONObject)parser.parse(String.valueOf(resultJson));
				JSONArray response=(JSONArray)resultJsonObj.get("response");
				for(Object fixture: response) {
					JSONObject fixtures =(JSONObject) fixture;

					JSONObject teams = (JSONObject) fixtures.get("teams");
					JSONObject homeTeam = (JSONObject) teams.get("home");
									String nameHTeam = (String) homeTeam.get("name");
									boolean winnerHTeam= (boolean) homeTeam.get("winner");
					JSONObject awayTeam = (JSONObject) teams.get("away");
									String nameATeam = (String) awayTeam.get("name");
									boolean winnerATeam= (boolean) awayTeam.get("winner");


					JSONObject fixturesInfo= (JSONObject) fixtures.get("fixture");
					String referee = (String) fixturesInfo.get("referee");



					JSONObject goals = (JSONObject) fixtures.get("goals");
				int hTeamGoals= (int) goals.get("home");
				int aTeamGoals =(int) goals.get("away");

				JSONObject status= (JSONObject) fixturesInfo.get("status");
				String shortStatus= (String) status.get("short");

				String date= (String) fixturesInfo.get("date");
				
			}
				}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return null;
}
			
	
		
	

	private static HttpURLConnection fetchApiResponse(String apiUrl) {
        String apiKey = "884d5577ceac895d970cf3472a73823e";
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("x-rapidapi-key","884d5577ceac895d970cf3472a73823e");
            connection.setRequestProperty("x-rapidapi-host", "v3.football.api-sports.io");
            connection.connect();
            return connection;
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        return null;
    }
}
