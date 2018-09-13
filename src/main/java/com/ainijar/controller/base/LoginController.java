package com.ainijar.controller.base;

import com.ainijar.security.SystemAuthorizingRealm;
import com.ainijar.utils.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    /**
     * 登录失败，真正登录的POST请求由Filter完成
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginFail(HttpServletRequest request, HttpServletResponse response, Model model) {
//        Map<String, Object> result = new HashMap<String, Object>();
//        try{
//            UsernamePasswordToken token = new UsernamePasswordToken(username, DecriptUtil.MD5(password));
//            Subject currentUser = SecurityUtils.getSubject();
//            if (!currentUser.isAuthenticated()){
//                //使用shiro来验证
//                token.setRememberMe(true);
//                currentUser.login(token);//验证角色和权限
//            }
//        }catch(Exception ex){
//            throw new RuntimeException(ex);
//        }
//        result.put("success", true);
//        return "modules/base/login";


        SystemAuthorizingRealm.Principal principal = UserUtils.getPrincipal();

        return "modules/base/sysIndex";
    }
}
