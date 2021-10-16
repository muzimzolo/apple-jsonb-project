package debugger.jsonb.apple.project.tests;

import java.util.Date;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import debugger.jsonb.apple.project.User;

public class TestSimpleBean {

	public static void main(String[] args) {

		User user = new User(1, "tester", "JSONtester@gmail.com", new Date(1997-01-10));
		user.setDateOfBirth(new Date(435434));
		Jsonb jsonb = JsonbBuilder.create();
		String result = jsonb.toJson(user);
		System.out.println("result:  " + result);

		Jsonb jsonb1 = JsonbBuilder.create();
		System.out.println(jsonb1.fromJson(result, User.class));

	}

}
