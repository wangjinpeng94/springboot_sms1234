package cn.sm1234.user.dao;

import cn.sm1234.user.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
