package springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class modelController {
	
	@RequestMapping("/value")
	public String function(Model model){
		model.addAttribute("username", "张三");
		return "index";
	}
}
