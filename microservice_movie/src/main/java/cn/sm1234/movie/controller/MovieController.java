package cn.sm1234.movie.controller;

import cn.sm1234.movie.pojo.User;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.print.DocFlavor;

/**
 * 电影购票
 */
@RequestMapping("/movie")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;






    /**
     * 购票
     */
//    @RequestMapping(value = "/order", method = RequestMethod.POST)
//    public String order(){
//        //模拟当前用户
//        Integer id=2;
//        //查询用户微服务，获取用户具体信息
//        //使用RestTemplate远程调用用户微服务
//        /**
//         * 参数一：调用URL地址
//         * 参数二：需要分装的对象类型
//         */
//        User user =
//                restTemplate.getForObject("http://localhost:9001/user/" + id, User.class);
//
//        System.out.println(user+"正在购票");
//
//        return "购票成功";
//    }


    /**
     * 方法使用eureka
     * @return
     */
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String order(){
        //模拟当前用户
        Integer id=2;
        //查询用户微服务，获取用户具体信息
        //使用RestTemplate远程调用用户微服务
        /**
         * 参数一：调用URL地址
         * 参数二：需要分装的对象类型
         */
        discoveryClient.getIn


        User user =
                restTemplate.getForObject("http://localhost:9001/user/" + id, User.class);

        System.out.println(user+"正在购票");

        return "购票成功";
    }

}
