package cn.tedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 19.2.18.
 */
@RestController
public class LoginTroller {
    @RequestMapping("/hello")
    public String hello(){
        return "ok";
    }
}
