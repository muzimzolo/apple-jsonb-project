package debugger.jsonb.apple.project.mappers;

import javax.json.bind.JsonbConfig;

// This class is to create a JSON object for the TestFormatting class to output 
// our Java object in JSON format
public class JsonObjectMapper {
	
	 public static JsonbConfig getObjectMapper(){
	        JsonbConfig config = new JsonbConfig();
	        config.withFormatting(Boolean.TRUE);
	        return config;
	    }

}
