package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 从Spring2开始，为了响应JDK1.5推出的注解功能，Spring开始大量加入注解来替代xml配置。
 * Spring的注解主要用来配置注入Bean，切面相关配置（@Transactional）。
 * 随着注解的大量使用，尤其相同的多个注解用到各个类中，
 * 会相当啰嗦。这就是所谓的模板代码，是Spring设计原则中要消除的代码。
 * 
 * 所谓元注解其实就是可以注解到别的注解上的注解，
 * 被注解的注解称之为组合注解、是可能有点拗口，体会含义最重要），
 * 组合注解具备元注解的功能。Spring的很多注解都可以作为元注解，
 * 而且Spring本身已经有很多组合注解，如@Configuration就是一个组合@Component注解，
 * 表明这个类其实也是一个Bean。
 * 
 * @author Mask
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService demoService = context.getBean(DemoService.class);
		demoService.outputResult();
		context.close();
	}
}
