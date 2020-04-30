package cn.aminga.shop.service.reg.service;

import cn.aminga.shop.commons.dao.UserDao;
import cn.aminga.shop.commons.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id) {
        return userDao.getOne(id);
    }
    public void add(User user) {
        userDao.save(user);
    }
}
