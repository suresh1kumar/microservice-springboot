
package com.mobitec.Mvoucher.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//import com.rolandopalermo.test.EmployeeDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.mobitec.Mvoucher"})
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/jsp/");
       // bean.setPrefix("/WEB-INF/WareHouse/");
        bean.setSuffix(".jsp");
        return bean;
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }
   /* @Bean
    public ViewResolver xmlViewResolver() {
        XmlViewResolver bean = new XmlViewResolver();
        bean.setLocation(new ClassPathResource("com/mobitec/Mvoucher/util/webss.xml"));
        return bean;
    }*/
   /* @Override      /CtopupSouth/src/com/mobitec/Mvoucher/util/webss.xml
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/").setViewName("home");
    }*/
    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/home.jsp");
    }
*/
    
    @Value("${db.driverClassName}")
	private String driverClassName;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public static PropertyPlaceholderConfigurer placeholderConfigurer() {
		PropertyPlaceholderConfigurer placeholderConfigurer = new PropertyPlaceholderConfigurer();
		Resource resource = new ClassPathResource("com/mobitec/Mvoucher/config/database.properties");
		placeholderConfigurer.setLocation(resource);
		return placeholderConfigurer;
	}
	 @Bean
	    public JdbcTemplate jdbcTemplate() {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate();
	        jdbcTemplate.setDataSource(dataSource());
	        return jdbcTemplate;
	    }
	/* @Bean
	    public EmployeeDaoImpl employeeDaoImpl(){
		 EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		 employeeDao.setJdbcTemplate(jdbcTemplate());
	        return employeeDao;
	    }
*/
}
