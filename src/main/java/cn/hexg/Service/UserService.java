package cn.hexg.Service;

import cn.hexg.db.dao.UserDao;
import cn.hexg.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
