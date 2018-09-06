package com.ainijar.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author slt
 * @date 2018/9/6
 */
@Controller
@RequestMapping(value = "${adminPath}")
public class LoginController {
    /**
     * 管理登录
     * @throws IOException
     */
    @GetMapping(value = "/login")
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        return "modules/base/login";
    }
}
