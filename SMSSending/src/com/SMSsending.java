package com;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SMSsending 
{
	public static void main(String[] args) 
	{
		HttpResponse response;
		try {
			response = Unirest.get("https://www.fast2sms.com/dev/bulkV2?authorization=WXfAe5cjnlMG0thTkdLD9IsgRyZbS7w41UzP3H8mKiqQNVEova9vDJtywEXpMNoUieOfPlq1r8HhdnTL&message=testsms&language=english&route=q&numbers=9898068132")
					  .header("cache-control", "no-cache")
					  .asString();
			
			System.out.println(response);
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
	}
}
