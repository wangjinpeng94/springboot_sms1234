package cn.sm1234.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Component
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取当前请求的参数 token-user
        int s=1/0;
        RequestContext currrentContext=RequestContext.getCurrentContext();
        HttpServletRequest request = currrentContext.getRequest();
        HttpServletResponse response = currrentContext.getResponse();
        String token = request.getParameter("token");
        if (!"user".equals(token)) {
            //不转发微服务，给用户响应
            currrentContext.setSendZuulResponse(false);
            //设置401状态码
            response.setStatus(401);
            return null;
        }
        return null;
    }
}
