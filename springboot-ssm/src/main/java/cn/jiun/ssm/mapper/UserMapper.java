package cn.jiun.ssm.mapper;

import cn.jiun.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper  extends tk.mybatis.mapper.common.Mapper<User> {
}
