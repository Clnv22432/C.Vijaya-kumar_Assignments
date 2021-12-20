package dispatcher.servlet;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.put("msg", "Welcone to Spring World !");
        return "index";
    }
}
