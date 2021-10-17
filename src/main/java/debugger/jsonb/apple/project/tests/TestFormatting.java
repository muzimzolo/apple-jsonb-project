package debugger.jsonb.apple.project.tests;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import debugger.jsonb.apple.project.Order;
import debugger.jsonb.apple.project.mappers.JsonObjectMapper;
import debugger.jsonb.cart.DataGenerator;

 /*
  * This class is to format the output in JSON format
  * Run this class to get the output in JSON without the need for a 
  * validator to format it
  */
public class TestFormatting {
    
    public static void main(String[] args) {
        Jsonb jsonb = JsonbBuilder.create(JsonObjectMapper.getObjectMapper());
        Order order = DataGenerator.getData();
        
        System.out.println( jsonb.toJson(order));
    }
    
}