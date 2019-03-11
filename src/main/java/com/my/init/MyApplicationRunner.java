package com.my.init;

import com.my.servlet.MyServletConetxt;
import javafx.application.Application;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author blackjack
 * @date 2019/3/9/16:19
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

  @Autowired
    MyServletConetxt myServletConetxt;
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        myServletConetxt.getServletContext().setAttribute("number",1);
        System.out.printf("===============初始化成功========================");
    }
}
