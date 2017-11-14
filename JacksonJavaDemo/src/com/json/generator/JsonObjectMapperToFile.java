package com.json.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.json.model.Address;
import com.json.model.Person;

public class JsonObjectMapperToFile {

	public static void main(String[] args) {
		Address address=new Address("221B Backer Street","London","England","900712");
		Person person=new Person(101,"Sherlock","Holmes",address);
		
		ObjectMapper mapper=new ObjectMapper();
		try {
			FileOutputStream fis=new FileOutputStream(new File("data.json"),true);
			JsonFactory factory=new JsonFactory();
			JsonGenerator jsonGen=mapper.getFactory().createGenerator(fis, JsonEncoding.UTF8);			
			//USed to do indentation of output in file and console
			//mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			mapper.writeValue(jsonGen, person);
			String json=mapper.writeValueAsString(person);
			System.out.println(json);
			
			//Reading from json file
			JsonParser parser =factory.createParser(new File("data.json"));
				while(parser.nextToken()!=JsonToken.END_OBJECT){
					person=mapper.readValue(new File("data.json"), Person.class);
					 System.out.println(person.getAddress().getCity());
				}
			
			 
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
			
		}

	}

}
