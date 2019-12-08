package com.datvexe.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
// Cấu hình để dùng tất cả hàm chung do JpaRepository cung cấp
@EnableJpaRepositories(basePackages = { "com.datvexe.repository" })
// Entity Transaction không cần phải thực hiện thủ công như mở kết nối, đóng kết nói ,..
@EnableTransactionManagement

// Cấu hình ManagerFactory để có thể sử dụng các ...

public class JPAConfig {
	// Cài đặt ManagerFactory
	@Bean(name ="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		// DataSource() là nơi cung cấp : user - pass - diver - url mà csdl dùng
		em.setDataSource(dataSource());
		// setPersistenceUnitName là chất xúc tác giữa table và entity
		em.setPersistenceUnitName("persistence-data");
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		// JpaProperties sẽ không dùng cơ chế dùng những đoạn để nó tạo table, sẽ tạo
		// các table dựa trên
		// các entity đã định nghĩa trong project. Tính năng tự động tạo table từ các
		// class.
		em.setJpaProperties(additionalProperties());
		return em;
	}

	// Cấu hình transaction Etity
	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
//		dataSource.setUrl(environment.getProperty("jdbc.url"));
//		dataSource.setUsername(environment.getProperty("jdbc.username"));
//		dataSource.setPassword(environment.getProperty("jdbc.password"));
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3307/mysqldb");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		return dataSource;
	}

	Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//		properties.setProperty("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
//		properties.setProperty("hibernate.format_sql", environment.getProperty("hibernate.format_sql"));
//		properties.setProperty("hibernate.default_schema", environment.getProperty("hibernate.default_schema"));
		properties.setProperty("hibernate.enable_lazy_load_no_trans", "true");
		// lệnh tọa table Khi database ổn định thì đóng lệnh "create-drop".
	//	properties.setProperty("hibernate.hbm2ddl.auto", "create");
		// sau khi tạo thành công thì kích hoạt "none"
		properties.setProperty("hibernate.hbm2ddl.auto", "none");

		return properties;
	}

}
