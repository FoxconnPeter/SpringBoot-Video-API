package com.imooc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @ClassName: WarStartApplication
 * @Description:
 * @Author: peter
 * @Mail: 597058061@qq.com
 **/


public class WarStartApplication extends SpringBootServletInitializer {

   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
       return builder.sources(Application.class);
   }

}
