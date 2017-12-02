package cn.hexg.db.dao;

import cn.hexg.po.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User queryUserById(Integer id) {
        User user = new User();
        user.setPassword("897");
        user.setUserId(id);
        user.setUserName("hexiagen");
        return user;
    }
}
