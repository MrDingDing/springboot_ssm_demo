package com.my.aop;

/**
 * create by blackjack on 2019/6/21
 */

import com.my.domain.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by lmb on 2018/9/5.
 */
@Aspect
@Component
public class AopTest {

    private Logger logger = LoggerFactory.getLogger(AopTest.class);

    /**
     * 定义切入点，切入点为com.my.service.HelloService下的所有函数
     */
    @Pointcut("execution(public * com.my.service.HelloService.*(..))")
    public void webLog(){
        System.out.println("切入点执行");
    }

    /**
     * 前置通知：在连接点之前执行的通知
     * @param joinPoint
     * @throws Throwable
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        // 记录下请求内容
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        User user = (User)ret;
        user.setTname("二次修改"+user.getTname());
        logger.info("RESPONSE : " + ret);
    }
}