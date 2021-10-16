package debugger.jsonb.apple.project.tests;

import javax.json.bind.JsonbBuilder;

import debugger.jsonb.apple.project.Order;
import debugger.jsonb.cart.DataGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class TestDataTypes {
	
	public static void main(String[] args) {

		/*
		 * fetch the shopping cart's data using an Order instance
		 * create JSON object using Jsonb API
		 */

		Order order = DataGenerator.getData();
		Jsonb jsonb = JsonbBuilder.create();

		// Write a text file to store a shopping cart's details   
		try (Writer writer = new FileWriter(new File("order.txt"))) {
			writer.write(jsonb.toJson(order));
			writer.flush();

		} catch (IOException e) {
			Logger.getLogger(TestDataTypes.class.getName()).log(Level.SEVERE, null, e);
		}

		try {
			
		    // return the order details in JSON format
			Order deserializedOrder = jsonb.fromJson(new FileReader(new File("order.txt")), Order.class);
			System.out.println(deserializedOrder);
		
		} catch (FileNotFoundException ex) {
			Logger.getLogger(TestDataTypes.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}