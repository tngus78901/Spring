package controller.user;

import kr.co.sboard.entity.TermsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/usesr/login")
    public String login(){
        return "/user/login";

    }

    @GetMapping("/user/terms")
    public String terms(Model model){
        TermsEntity terms = userService.findByTerms();
        model.addAttribute("terms",terms);
        return "/user/terms";
    }
}
