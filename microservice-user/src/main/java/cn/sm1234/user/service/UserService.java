package cn.sm1234.user.service;

import cn.sm1234.user.dao.UserDao;
import cn.sm1234.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 查询所有用户
     */
    public List<User> findAll(){
        return  userDao.findAll();
    }
    /**
     * 根据id查询用户
     */
    public User findById(Integer id){
        return userDao.findById(id).get();
    }
    /**
     * 添加用户
     */
    public void add(User user){
        userDao.save(user);
    }
    /**
     * 修改用户
     */
    public void update(User user){
        userDao.save(user);//user对象必须有数据存在的ID值
    }
    /**
     * 根据id删除用户
     */
    public void deleteById(Integer id){
        userDao.deleteById(id);

    }


}
