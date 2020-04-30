package cn.aminga.shop.commons.dao;
import cn.aminga.shop.commons.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}

