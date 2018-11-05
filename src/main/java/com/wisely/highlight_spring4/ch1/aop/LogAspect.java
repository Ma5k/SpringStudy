package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 1��ͨ��@Aspectע������һ������
 * 2��ͨ��@Component�ô������Ϊһ��Spring���������Bean
 * 3��ͨ��@PointCutע�������е�
 * 4��ͨ��@Afterע������һ�����ԣ���ʹ��@PointCut������е�
 * 5��ͨ������ɻ��ע���ϵ����ԣ�Ȼ������־��¼��صĲ������������ͬ��
 * 6��ͨ��@Beforeע������һ�����ԣ��˽���ֱ��ʹ�����ع�����Ϊ������
 * @author Mask
 *
 */
@Aspect
@Component
public class LogAspect {
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
	public void annotationPointCut() {};
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("ע��ʽ���� " + action.name());
	}
	
	@Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("��������ʽ���أ�" + method.getName());
	}
}
