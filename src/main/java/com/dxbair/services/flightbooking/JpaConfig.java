package com.dxbair.services.flightbooking;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configuration class for JPA settings.
 * Enables transaction management and JPA repositories.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.dxbair.services.flightbooking.domain.repo"
)
public class JpaConfig {

}
