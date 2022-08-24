package com.buu.bcs.database;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import com.buu.bcs.configuration.Application;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = { "com.buu.bcs.repository", "com.buu.bcs.repository.*" })
public class DataSourceConfig {
    @Primary
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                       @Qualifier("springDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.buu.bcs.entity", "com.buu.bcs.entity.*")
                .persistenceUnit("rdsp").build();
    }

    @Primary
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
        Application.getInstance().setEntitymanagerFactory(entityManagerFactory);
        return new JpaTransactionManager(entityManagerFactory);
    }

    @Bean("springDataSource")
    @Qualifier("springDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource springDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();

    }

    @Bean
    @Qualifier("JdbcTemplate")
    JdbcTemplate springJdbcTemplate(@Qualifier("springDataSource") DataSource springDataSource) {
        return new JdbcTemplate(springDataSource);
    }


}
