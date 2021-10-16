package debugger.jsonb.apple.project.tests;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

// 
public class TestJsonpTypes {
    
    public static void main(String[] args) {
        JsonObject jsonObject = Json.createObjectBuilder().add("name", "Muzi")
                .add("profession", "Developer").build();
        
        Jsonb jsonb = JsonbBuilder.create();
        
        System.out.println(jsonb.toJson(jsonObject));
    }
    
}