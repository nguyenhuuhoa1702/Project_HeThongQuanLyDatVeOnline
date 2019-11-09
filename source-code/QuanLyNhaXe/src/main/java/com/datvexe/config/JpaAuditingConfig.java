package com.datvexe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig {
	@Bean
	public AuditorAware<String> auditorProvider()
	{
		return new AutorAwareImpl();
	}
	public static class AutorAwareImpl implements AuditorAware<String>
	{

		@Override
		// Ðây là nõi get user name , id
		public String getCurrentAuditor() {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (authentication == null)
			{
				return null;
			}
			return authentication.getName();
		}
	}
}
