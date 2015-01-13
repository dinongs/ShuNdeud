package com.example.shundeud;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class Web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Web w=new Web();
    w.Test();
	}
	public void Test()
	{
		JSONObject json=new JSONObject();
		try {
			json.put("ndeud", "an");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] data=json.toString().getBytes();
		
		String requestUrl="http://10.0.2.2:8080/LearnBootstrap/SearchNdeud?ndeud=an";
		
		try {
			URL realUrl=new URL(requestUrl);
			HttpURLConnection conn=(HttpURLConnection)realUrl.openConnection();
			
			conn.setDoOutput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("Charaset", "UTF-8");
			conn.setRequestProperty("Content-Type", "application/text");
			
			if(conn.getResponseCode()==200)
			{
				InputStream is=conn.getInputStream();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
