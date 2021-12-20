package dispatcher.servlet;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("registration.htm")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap modelMap) {
        modelMap.put("info", "Hello User");
        return "Registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("regModel") @Validated RegistrationModel regModel) {
        System.out.println("in submit" + regModel);
        String password = regModel.getPassword();
        if (password != null && password.equals("onlinetutorialspoint")) {
            modelMap.put("userInfo", regModel.getUserName());
            return "Home";
        } else {
            modelMap.put("error", "Invalid UserName / Password");
            return "Registration";
        }

    }
}