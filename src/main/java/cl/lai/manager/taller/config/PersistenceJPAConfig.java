package cl.lai.manager.taller.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceJPAConfig {
	
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	      LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	      em.setDataSource(this.dataSource);
	      em.setPackagesToScan(new String[] { "cl.lai.manager.taller.vo" });
	 
	      HibernateJpaVendorAdapter vendorAdapter = new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
	      
	      vendorAdapter.setDatabase(Database.MYSQL);
	      vendorAdapter.setGenerateDdl(false);
	      
	      em.setJpaVendorAdapter(vendorAdapter);
	    
	      return em;
	 }
	
	@Bean
	public PlatformTransactionManager transactionManager(  EntityManagerFactory emf){
       JpaTransactionManager transactionManager = new JpaTransactionManager();
       transactionManager.setEntityManagerFactory(emf);
       return transactionManager;
	}
	
	@Bean(name="jdbcTemplateConfig")
	public JdbcTemplate createJdbcTemplate( ) {
		return new JdbcTemplate(this.dataSource);
	}
}
