package com.netty.httpserver.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 
 * @ClassName: SpringContextUtil   
 * @Description: 初始化spring上下文
 * @author liyut
 * @version 1.0 
 * @date 2017年2月22日 下午6:41:36
 */
@Service
public class SpringContextUtil implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		applicationContext = context;
	}

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

}
