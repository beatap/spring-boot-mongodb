package pl.beata.springbootmongodb.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Profile("mysql")
@Configuration
public class DBMySqlConfig {

    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/persons_db?useTimezone=true&serverTimezone=GMT")
                .username("root")
                .password("root")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }
}
