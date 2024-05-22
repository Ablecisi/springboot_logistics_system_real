package com.ablecisi.controller;

import com.ablecisi.entity.Emp;
import com.ablecisi.service.EmpService;
import com.ablecisi.util.JwtUtils;
import com.ablecisi.util.model.RCE;
import com.ablecisi.util.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * itheima_web_project
 * com.ablecisi.contrller
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/5/1
 * 星期三
 * 下午4:35
 */
@Slf4j
@RestController()
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private EmpService empService;

    @PostMapping()
    public Result login(String username, String password){
        log.info("登录员工, 参数: username = {},password={}", username, password);
        Emp emp = new Emp();
        emp.setUsername(username);
        emp.setPassword(password);
        Emp user = empService.login(emp); // 登陆

        // 登陆成功,生成JWt令牌
        if (user != null) {
            // 生成JWT令牌
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", user.getId());
            claims.put("name", user.getName());
            claims.put("username", user.getUsername());

            String jwt = JwtUtils.generateJwt(claims); // 生成JWT令牌
            return Result.success().data(jwt);
        }

        return Result.error(RCE.LOGIN_ERROR);
    }
}
