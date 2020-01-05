package cn.sm1234.movie.client;

import ch.qos.logback.core.boolex.EvaluationException;
import cn.sm1234.movie.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "microservice-user")
public interface UserController {
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable(value = "id") Integer id);
}
