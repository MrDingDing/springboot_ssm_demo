package com.my.controller;

import com.my.domain.User;
import com.my.service.HelloService;
import com.my.servlet.MyServletConetxt;
import com.mysql.jdbc.log.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

//controller层的注解 把此类注册到spring容器中
@Controller
public class HelloController {
    @Autowired
    HelloService helloService;
   @Autowired
    MyServletConetxt myServletConetxt;
    /**
     * helloworld
     * @return
     */
    //可以直接将return的数据返回到请求体中    （异步传输json 接收）
    @ResponseBody
    //get请求的 /hello 的
    @GetMapping(value = "/hello")
    String helloController(HttpServletRequest request){

        ServletContext servletContext = myServletConetxt.getServletContext();
        int number = (int)servletContext.getAttribute("number");
        System.out.println("这是第"+(++number)+"次请求");
        servletContext.setAttribute("number",number);
         helloService.testHttpGet("/hello");
  return "hello,world";
    }

    /**模拟从数据库中查询一条数据
     *
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/hello/{id}")
    User insert(@PathVariable("id") Integer id){
        //存到日志文件中
         Logger logger= LoggerFactory.getLogger(this.getClass());
         logger.debug("id为"+id);
        System.out.println("id = [" + id + "]");
        return   helloService.selectById(id);

   }



}
