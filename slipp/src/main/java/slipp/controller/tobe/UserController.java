package slipp.controller.tobe;

import nextstep.mvc.tobe.ModelAndView;
import nextstep.web.annotation.Controller;
import nextstep.web.annotation.RequestMapping;
import nextstep.web.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/users/form")
    public ModelAndView userForm(HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }

    @RequestMapping("/users/loginForm")
    public ModelAndView userLoginForm(HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }

    @RequestMapping("/users")
    public ModelAndView users(HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public ModelAndView userLogin(HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }

//        mappings.put("/users/form", new ForwardController("/user/form.jsp"));
//        mappings.put("/users/loginForm", new ForwardController("/user/login.jsp"));
//        mappings.put("/users", new ListUserController());
//        mappings.put("/users/login", new LoginController());
}
