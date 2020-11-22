package com.hbh.base.jwt;

import cn.hutool.json.JSONUtil;
import com.auth0.jwt.interfaces.Claim;
import com.hbh.base.utils.ResponseEnum;
import com.hbh.base.utils.ResponseUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * JWT过滤器，拦截 /secure的请求
 */
@WebFilter(filterName = "JwtFilter", urlPatterns = "/sysrole/*")
public class JwtFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) req;
        final HttpServletResponse response = (HttpServletResponse) res;
        response.setCharacterEncoding("UTF-8");
        //获取token
        final String token = request.getParameter("token");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            chain.doFilter(request, response);
        }
        // Except OPTIONS, other request should be checked by JWT
        else {
            if (token == null) {
                response.getWriter().write(ResponseEnum.ERROE_405.getMsg());
                return;
            }
            Map<String, Claim> userData = JwtUtil.verifyToken(token);
            if (userData == null) {
                response.getWriter().write(JSONUtil.parse(ResponseUtil.fail(ResponseEnum.ERROE_406)).toString());
                return;
            }
            Integer id = userData.get("id").asInt();
            String name = userData.get("name").asString();
            String userName = userData.get("userName").asString();
            //拦截器 拿到用户信息，放到request中
            request.setAttribute("id", id);
            request.setAttribute("name", name);
            request.setAttribute("userName", userName);
            chain.doFilter(req, res);
        }
    }
    @Override
    public void destroy() {
    }
}
