package DispatcherServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/Click here to See Welcome Message...")
	public ModelAndView helloWorld() {
 
		String message = "Hello Vijay welcome to my world";
		return new ModelAndView("welcome", "message", message);
	}

}