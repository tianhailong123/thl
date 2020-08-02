package cn.jiun.ssm.controller;

import cn.jiun.ssm.pojo.User;
import cn.jiun.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserByid(@PathVariable("id")Long id){
        return this.userService.queryUserByid(id);
    }

    @GetMapping("test")
    @ResponseBody
   public String test(){
       return "hello user!";
   }

}
