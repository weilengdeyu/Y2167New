package cn.studio.aop;/**
 * Created by Happy on 2018-04-15.
 */

import cn.studio.annotation.BusinessAnnotation;
import cn.studio.entity.Log;
import cn.studio.entity.UserInfo;
import cn.studio.service.ILogService;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class LogAfterAdvice implements AfterReturningAdvice,ApplicationContextAware {
    private ApplicationContext act;
    private static final Logger logger=  Logger.getLogger(LogAfterAdvice.class);
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        //注解，拿到类型的元数据
        BusinessAnnotation annotation = method.getAnnotation(BusinessAnnotation.class);
        //构建Log实例
        Log log=new Log();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(sdf.format(new Date()));
       //Spring容器有值了
        ILogService service = (ILogService)act.getBean("logService");
        //获取session的内容
        HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session =request.getSession();
        UserInfo info= (UserInfo)session.getAttribute("userInfo");
        if (info!=null){
            log.setOperatedatetime(date);
            logger.info(date);
            log.setUsercode(info.getUid().toString());
            logger.info(info.getUid().toString());
            log.setUsername(info.getUname());
            logger.info(info.getUname());
            if (annotation!=null) {
                log.setOperateinfo(annotation.option());
                service.addLog(log);
                logger.info(annotation.option());
            }
        }

    }

    public void setApplicationContext(ApplicationContext act) throws BeansException {
        this.act=act;
    }
}
