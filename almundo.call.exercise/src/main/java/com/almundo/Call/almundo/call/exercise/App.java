package com.almundo.Call.almundo.call.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.almundo.Call.almundo.call.exercise.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
    	Thread producer = new Thread(new CallProducer());
    	Thread consumer = new Thread(new Dispatcher());
    	
    	//producer.run();
    	//consumer.run();
    	
    	producer.start();
    	consumer.start();
    	
       // Logger log = Logger.getLogger(AsyncExecutorCall.class.getName());
     /*   @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
        
        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) context
				.getBean("taskExecutor");
        
        
        AsyncExecutorCall task = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee0 = new Employee();
        Call call0 = new Call();
        call0.setId(0);
        employee0.setId(0);
        employee0.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task.setEmployee(employee0);
        task.setId(0);
		taskExecutor.execute(task);
		
		AsyncExecutorCall task1 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task1.setEmployee(employee1);
        task1.setId(1);
		taskExecutor.execute(task1);
		
		
		AsyncExecutorCall task2 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task2.setEmployee(employee2);
        task2.setId(2);
		taskExecutor.execute(task2);
		
		
		AsyncExecutorCall task3 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task3.setEmployee(employee3);
        task3.setId(3);
		taskExecutor.execute(task3);
		
		
		AsyncExecutorCall task4 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee4 = new Employee();
        employee4.setId(4);
        employee4.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task4.setEmployee(employee4);
        task4.setId(4);
		taskExecutor.execute(task4);
		
		
		AsyncExecutorCall task5 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee5 = new Employee();
        employee5.setId(5);
        employee5.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task5.setEmployee(employee5);
        task5.setId(5);
		taskExecutor.execute(task5);
		
		
		AsyncExecutorCall task6 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee6 = new Employee();
        employee6.setId(6);
        employee6.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task6.setEmployee(employee6);
        task6.setId(6);
		taskExecutor.execute(task6);
		
		AsyncExecutorCall task7 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee7 = new Employee();
        employee7.setId(7);
        employee7.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task7.setEmployee(employee7);
        task7.setId(7);
		taskExecutor.execute(task7);
		
		
		AsyncExecutorCall task8 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee8 = new Employee();
        employee8.setId(8);
        employee8.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task8.setEmployee(employee8);
        task8.setId(8);
		taskExecutor.execute(task8);
		
		
		AsyncExecutorCall task9 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee9 = new Employee();
        employee9.setId(9);
        employee9.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task9.setEmployee(employee9);
        task9.setId(9);
		taskExecutor.execute(task9);
		
		
		AsyncExecutorCall task10 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee10 = new Employee();
        employee10.setId(10);
        employee10.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task10.setEmployee(employee10);
        task10.setId(10);
		taskExecutor.execute(task10);
		
		AsyncExecutorCall task11 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee11 = new Employee();
        employee11.setId(11);
        employee11.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task11.setEmployee(employee11);
        task11.setId(11);
		taskExecutor.execute(task11);
		
		
		AsyncExecutorCall task12 = (AsyncExecutorCall) context.getBean("asyncExecutorCall");
        Employee employee12 = new Employee();
        employee12.setId(12);
        employee12.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
        task12.setEmployee(employee12);
        task12.setId(12);
		taskExecutor.execute(task12);*/
    }
}
