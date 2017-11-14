package com.json.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonToFile {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper=new ObjectMapper();
		JsonFactory jsonFactory=new JsonFactory();		
		try(JsonGenerator jsonGen=mapper.getFactory().createGenerator(new File("data.json"),JsonEncoding.UTF8)){
			
		jsonGen.writeStartObject();
		jsonGen.writeStringField("name","House");
		jsonGen.writeNumberField("age", 30);
		jsonGen.writeFieldName("messages");
		jsonGen.writeStartArray();
		jsonGen.writeString("msg1");
		jsonGen.writeString("msg2");
		jsonGen.writeString("msg3");
		jsonGen.writeEndArray();
		jsonGen.writeEndObject();		
		
		}catch(JsonGenerationException e){
			e.printStackTrace();
		}

	}

}
