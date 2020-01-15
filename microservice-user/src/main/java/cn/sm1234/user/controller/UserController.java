package cn.sm1234.user.controller;

import cn.sm1234.user.pojo.User;
import cn.sm1234.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@RestController  //= restController +requestmapping
@Api(description = "用户控制器")
public class UserController {



    @Autowired
    UserService userService;
    /**
     * 查询所有用户
     */
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation("查询所有的用户")
    public List<User> findALL(){
        //模拟用户数据
//
//        List<User> list=new ArrayList<User>();
//        list.add(new User(1,"张三","123456","男",1000.0));
//        list.add(new User(2,"李四","123456","女",2000.0));
//        list.add(new User(3,"陈六","123456","男",2500.0));
//        return list;


        return userService.findAll();

    }

    /**
     * 根据id查询用户
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ApiOperation("根据主键查询所有的用户")
    public User findById(@PathVariable Integer id){
        System.out.println("调用user服务222");
        return userService.findById(id);
    }
    /**
     * 添加用户
     */
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation("添加用户")
public String add(@RequestBody User user){
    userService.add(user);

    return "添加成功";
}
/**
 * 修改用户
 */
@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
@ApiOperation("根据主键修改用户")
public String update(User user,@PathVariable Integer id){
    //设置id
    user.setId(id);
    userService.update(user);
    return "修改成功";

}
/**
 * 根据id删除用户
 */
@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
@ApiOperation("根据主键删除用户")
public String deleteById(@PathVariable Integer id){
    userService.deleteById(id);
    return "删除成功";
}



}
