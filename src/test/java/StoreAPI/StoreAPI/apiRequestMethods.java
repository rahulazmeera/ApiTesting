package StoreAPI.StoreAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;





public class apiRequestMethods {

	/*****
	 * 
	 * FOR POST METHOD 
	 * @throws IOException 
	 * 
	 * 
	 */
	///create method with parameters
	
	public static void POST_Request(String EndpointURL, String APIKEY, String RequestBody, String ReqType, String Name) throws IOException{
   
		String USER_AGENT = "Mozilla/5.0";
	
		String url =EndpointURL;
	
		URL obj = new URL(url);
	
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

	//add reuqest header
	con.setRequestMethod(ReqType);
	con.setRequestProperty("User-Agent", USER_AGENT);
	con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
    con.setRequestProperty("x-api-key", APIKEY);
	String urlParameters = RequestBody;

	// Send post request
	con.setDoOutput(true);
	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	wr.writeBytes(urlParameters);
	wr.flush();
	wr.close();

	int responseCode = con.getResponseCode();
     System.out.println("Response Code for"+Name+responseCode);
	
  //asserting the response code of the request	
   
	if(responseCode==200){
	System.out.print("Good Response Code"+responseCode);
   }else{
	 
	   System.out.print("Bad Response Code"+responseCode);
   }
   
   
   //read the response code. 
	BufferedReader in = new BufferedReader(
	        new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();

	while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	}
	in.close();

	//print result
	System.out.println(response.toString());
	
	}
	

	/*****
	 * 
	 * FOR PUT METHOD 
	 * @throws IOException 
	 * 
	 * 
	 */
	 
	
	public static void getRequest(String EndpointURL, String APIKEY, String ReqType, String Name) throws IOException{
		
		String USER_AGENT = "Mozilla/5.0";
		
		URL obj = new URL(EndpointURL);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod(ReqType);

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("x-api-key", APIKEY);

		int responseCode = con.getResponseCode();
		//System.out.println("\nSending 'GET' request to URL : " + url);
		
		if(responseCode==200){
			System.out.println("Good Response code"+responseCode);
		}else{
			System.out.println("Bad Ressponse Code"+responseCode);
		}
		
		System.out.println("Response Code for : "+Name+ responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

		
     
	 
		
	  
	
	    

		

	}
	
	
	
	
		
	}
	
	
	
	
	
	
	
	

