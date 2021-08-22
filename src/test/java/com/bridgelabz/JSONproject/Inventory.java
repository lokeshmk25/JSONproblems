package com.bridgelabz.JSONproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory {
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser(); 
		
		FileReader reader = new FileReader(".\\jsonfiles\\inventory.json");
		
		Object obj=jsonparser.parse(reader);
		
		JSONObject inventryobj=(JSONObject)obj;
		JSONArray ricearray = (JSONArray)inventryobj.get("Rice");
		JSONArray wheatarray = (JSONArray)inventryobj.get("Wheat");
		JSONArray pulsesarray = (JSONArray)inventryobj.get("Pulses");
		
		System.out.println("Rice details are ..");
		
		for(Object item1: ricearray) {
			JSONObject ricedetails=(JSONObject) item1;
			String name = (String) ricedetails.get("name");
			Double weight =(Double) ricedetails.get("weight");
			Double price = (Double) ricedetails.get("price");
			
			System.out.println("\nName:"+name);
			System.out.println("\nweight:"+weight+ "kg");
			System.out.println("\nprice:"+price+ "Rs");
			
			double riceprice = weight*price;
			
			System.out.println("Total price of " +ricedetails.get("name")+ "is :" +riceprice+ "Rs");
		}
				System.out.println("---------------------------------------------");
				System.out.println("wheat details are ..");
		
		for(Object item2: wheatarray) {
			JSONObject wheatdetails=(JSONObject) item2;
			String name = (String) wheatdetails.get("name");
			Double weight =(Double) wheatdetails.get("weight");
			Double price = (Double) wheatdetails.get("price");
			
			System.out.println("\nName of wheat is:"+name);
			System.out.println("\nweight of wheat is:"+weight);
			System.out.println("\nprice of wheat is:"+price);
			double wheatprice = weight*price;
			
			System.out.println("Total price of " +wheatdetails.get("name")+ "is :" +wheatprice+ "Rs");
		}
				System.out.println("---------------------------------------------");
				System.out.println("pulse details are ..");
		
		for(Object item3: pulsesarray) {
			JSONObject pulsesdetails=(JSONObject) item3;
			String name = (String) pulsesdetails.get("name");
			Double weight =(Double) pulsesdetails.get("weight");
			Double price = (Double) pulsesdetails.get("price");
			
			System.out.println("\nName of pulses is:"+name);
			System.out.println("\nweight of pulses is:"+weight);
			System.out.println("\nprice of pulses is:"+price);
			double pulseprice = weight*price;
			System.out.println("Total price of " +pulsesdetails.get("name")+ "is :" +pulseprice+ "Rs");
		}
		
		
	}

}

