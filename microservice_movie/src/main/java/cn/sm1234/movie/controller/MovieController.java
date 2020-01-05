package cn.sm1234.movie.controller;


import cn.sm1234.movie.client.UserController;
import cn.sm1234.movie.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.print.DocFlavor;
import java.util.List;

/**
 * 电影购票
 */
@RequestMapping("/movie")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;






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
//        //到eureka发现用户微服务
//        //返回值为什么是list集合呢，获取到所有同名的微服务
//        List<ServiceInstance> instances = discoveryClient.getInstances("microservice-user");
//        //没有使用负载均衡，只能获取第一个服务
//        ServiceInstance serviceInstance = instances.get(0);
//
//
//        User user =
//                restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/" + id, User.class);
//
//        System.out.println(user+"正在购票");
//
//        return "购票成功";
//    }

    /**
     * 购票方法 负载均衡
     * @return
     */

//
//    @Autowired
//    private LoadBalancerClient client;

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
//        //到eureka发现用户微服务
//        //返回值为什么是list集合呢，获取到所有同名的微服务
////        List<ServiceInstance> instances = discoveryClient.getInstances("microservice-user");
////        //没有使用负载均衡，只能获取第一个服务
////        ServiceInstance serviceInstance = instances.get(0);
//
////使用ribbon帮助我们选择一个合适的服务实例
//        ServiceInstance serviceInstance = client.choose("microservice-user");
//        User user =
//                restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/" + id, User.class);
//
//        System.out.println(user+"正在购票");
//
//        return "购票成功";
//    }

    /**
     * 购票方法 使用ribbon负载均衡 简化版
     * @return
     */


//    @Autowired
//    private UserController userController;
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
//        //到eureka发现用户微服务
//        //返回值为什么是list集合呢，获取到所有同名的微服务
////        List<ServiceInstance> instances = discoveryClient.getInstances("microservice-user");
////        //没有使用负载均衡，只能获取第一个服务
////        ServiceInstance serviceInstance = instances.get(0);
//
////使用ribbon帮助我们选择一个合适的服务实例
//      //  ServiceInstance serviceInstance = client.choose("microservice-user");
////        User user =
////                restTemplate.getForObject("http://microservice-user/user/" + id, User.class);
//        User user = userController.findById(id);
//        System.out.println(user+"正在购票");
//
//        return "购票成功";
//    }







//    /**
//     * 购票  Hystrix
//     */
//    @RequestMapping(value = "/order", method = RequestMethod.POST)
////@HystrixCommand(fallbackMethod = "fallback")
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
//                restTemplate.getForObject("http://microservice-user/user/" + id, User.class);
//
//        System.out.println(user+"正在购票");
//
//        return "购票成功";
//    }
//    public String fallback(){
//        System.out.println("发生熔断。。。。");
//return  "发生熔断。。。。";
//    }



     @Autowired
    private UserController userController;
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
        //到eureka发现用户微服务
        //返回值为什么是list集合呢，获取到所有同名的微服务
//        List<ServiceInstance> instances = discoveryClient.getInstances("microservice-user");
//        //没有使用负载均衡，只能获取第一个服务
//        ServiceInstance serviceInstance = instances.get(0);

//使用ribbon帮助我们选择一个合适的服务实例
      //  ServiceInstance serviceInstance = client.choose("microservice-user");
//        User user =
//                restTemplate.getForObject("http://microservice-user/user/" + id, User.class);
        User user = userController.findById(id);
        System.out.println(user+"正在购票");

        return "购票成功";
    }






}
