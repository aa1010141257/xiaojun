package config;

import org.springframework.context.annotation.*;

/**
 *
 *
 */
@Configuration // 指定跟xml配置一样的配置文件
@ComponentScan(basePackages = "com.itheima.*") // 扫描需要给spring容器管理的包
@Import(jdbcConfig.class) // 导入其他配置文件，为子类
@PropertySource("classpath:jdbcConfig.properties") // 指定properties文件
public class SpringConfiguration {

}
