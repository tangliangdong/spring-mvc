package springMVC;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class FirstController {
	
	@RequestMapping("/world")
	public String world(){
		return "index";
	}
	@RequestMapping("/person")
	public String helloPerson(Model model){
		model.addAttribute("username", "小唐");
		return "index";
	}
	
	@RequestMapping(value="/json",produces = MediaType.APPLICATION_JSON_VALUE) 
	public @ResponseBody User helloJson(){
		User user = new User();
		user.setId(1);
		user.setUsername("Jack");
		return user;
	}
	@RequestMapping(value = "/XML",produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public @ResponseBody User helloXML(){
		User user = new User();
		user.setId(2);
		user.setUsername("Tom");
		return user;
	}
	@RequestMapping(value = "/String",produces = "Application/String")
	public @ResponseBody String helloString(){
		User user = new User();
		user.setId(2);
		user.setUsername("Tom");
		return "user";
	}
	
	
}
