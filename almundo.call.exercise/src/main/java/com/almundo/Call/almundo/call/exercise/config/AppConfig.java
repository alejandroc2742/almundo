package com.almundo.Call.almundo.call.exercise.config;
/***
 * 
 * @author Alejandro Céspedes
 * Clase utilitaria para la configuración de la aplicación.
 *
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan(basePackages = "com.almundo.Call.almundo.call.exercise")
public class AppConfig {
	public static final String EMPLOYEE_ROLE_OPERATOR = "operador";
	public static final String EMPLOYEE_ROLE_DIRECTOR = "director";
	public static final String EMPLOYEE_ROLE_SUPERVISOR = "supervisor";
	public static final String SYSTEM_BUSY = "all agents are busy";
	public static final long TIME_FOR_NEW_CALL = 400;
	public static final long WAIT_FOR_EMP_BUSY = 500;
	public static final long TIME_IN_CALL = 7000;

	@Bean
	public ThreadPoolTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
		pool.setCorePoolSize(10);
		pool.setMaxPoolSize(10);
		pool.setWaitForTasksToCompleteOnShutdown(true);
		return pool;
	}
}