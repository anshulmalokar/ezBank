package com.example.loan.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.example.loan.loan.dto.LoansDtoInfo;

@SpringBootApplication
@EnableConfigurationProperties(LoansDtoInfo.class)
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class LoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplication.class, args);
	}

}
