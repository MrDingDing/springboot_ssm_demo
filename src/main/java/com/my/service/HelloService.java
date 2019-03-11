package com.my.service;


import com.my.dao.HelloMapper;
import com.my.domain.User;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    //引入dao层的对象
    @Autowired
    HelloMapper helloMapper;
    public User selectById(Integer id) {
        System.out.printf(helloMapper.toString());
        return  helloMapper.getEmpById(id);
    }


    public String testHttpGet(String url) {
                String result = null;
               CloseableHttpClient httpClient = HttpClients.createDefault();
                 List<NameValuePair> pairs = new ArrayList<NameValuePair>();

               CloseableHttpResponse response = null;
                 try {
                     //
                     URIBuilder builder = new URIBuilder(url);
                        builder.setParameters(pairs);
                         HttpGet get = new HttpGet(builder.build());
                         response = httpClient.execute(get);
                         if(response != null && response.getStatusLine().getStatusCode() == 200)
                             {
                                 HttpEntity entity = response.getEntity();
                                 return entity.toString();
                             }

                     } catch (URISyntaxException e) {
                         e.printStackTrace();
                     } catch (ClientProtocolException e) {
                         e.printStackTrace();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }finally {
                         try {
                                 httpClient.close();
                                 if(response != null)
                                     {
                                         response.close();
                                     }
                           } catch (IOException e) {
                                 e.printStackTrace();
                             }
                     }
                     return null;
    }
}
