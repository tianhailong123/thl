package cn.jiun.ssm.service;

import cn.jiun.ssm.mapper.UserMapper;
import cn.jiun.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


     public User queryUserByid(Long id){
         return  this.userMapper.selectByPrimaryKey(id);
     }

     @Transactional
     public void deleteUserByid(Long id){
         this.userMapper.deleteByPrimaryKey(id);
     }

}
