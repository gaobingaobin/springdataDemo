package cn.com.gaobin.springdemo.controller;

import cn.com.gaobin.springdemo.model.UserInfo;
import cn.com.gaobin.springdemo.service.UserinfoService;
import cn.com.gaobin.springdemo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gaobin on 2016/8/12.
 */
@Controller
public class MainController {
    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (StringUtil.isNotBlank(username) && StringUtil.isNotBlank("password")) {
            UserInfo user = userinfoService.findByUsernameAndPassword(username, password);
            if (user == null) {
                request.setAttribute("loginMessage", "用户名或密码错误！");
                return "login";
            } else {
                request.getSession().setAttribute("currUser", user);
                return "redirect:main.html";
            }
        } else {
            request.setAttribute("loginMessage", "用户名和密码不能为空");
            return "login";
        }

    }

    @RequestMapping("main.html")
    public String main() {
        return "fault_operator_index";
    }


}