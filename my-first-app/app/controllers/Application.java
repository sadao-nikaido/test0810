package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.*;
import play.mvc.*;

import play.libs.Json;

public class Application extends Controller {

	public Result index() {
		//List<Message> msgs = Message.find.all();
		//return ok(index.render("please set form.", msgs));
		return ok(views.html.index.render("please set form."));
	}

	//JSONデータの作成
	public Result ajax() {
		String input = request().body().asFormUrlEncoded().get("input")[0];
		ObjectNode result = Json.newObject();
		if(input == null || input.length() == 0){
			result.put("status", "BAD");
			result.put("message", "Can't get sending data...");
			return ok(result);
		} else {
			result.put("status", "OK");
			result.put("message", input);
			return ok(result);
		}
	}
}
