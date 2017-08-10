package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.*;
import play.mvc.*;

import play.libs.Json;

public class MyJsonSample extends Controller {

    public Result index() {
		return ok();
    }

	public Result sayHello() {
		ObjectNode result = Json.newObject();
		result.put("exampleField1", "Hello world!");
		result.put("name", "tsu-nera");

		ObjectNode result2 = Json.newObject();
		result2.put("subField1", "foo");
		result2.put("subField2", "bar");
		result.put("exampleField3", result2);

		return ok(result);
	}	

	public Result sayHello2() {
		JsonNode json = request().body().asJson();
		if(json == null) {
			return badRequest("Expecting Json data");
		} else {
			String name = json.findPath("name").textValue();
			if(name == null) {
				return badRequest("Missing parameter [name]");
			} else {
				return ok("Hello " + name);
			}
		}		
	}	
}
