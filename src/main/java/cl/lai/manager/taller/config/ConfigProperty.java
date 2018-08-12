package cl.lai.manager.taller.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.apache.commons.dbcp.BasicDataSource;
 
@Configuration
public class ConfigProperty {
	
	@Value("${database.username}")
    private String username;
 
    @Value("${database.url}")
    private String url;
  
    @Value("${database.driverClassName}")
    private String driverClassName;
    
    @Value("${database.password}")
    private String password;
    
    @Bean(name="dataSource")
    public DataSource createDataSource() {
    	BasicDataSource source = new BasicDataSource();
    	source.setDriverClassName(this.driverClassName);
    	source.setUrl(this.url);
    	source.setUsername(this.username);
    	source.setPassword(this.password);
    	return source;
    }
}