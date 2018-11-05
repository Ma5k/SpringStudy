package com.wisely.highlight_spring4.ch2.perpost;

/**
 * 	�ڿ��������У���������Beanʹ��֮ǰ����֮����Щ��Ҫ�Ĳ�����
 * 	Spring��Bean���������ڵĲ����ṩ��֧�֡���ʹ��Java���ú�ע���������ṩ�������ַ�ʽ��
 * 	1��Java���÷�ʽ��ʹ��@Bean��initMethod��destroyMethod(�൱��xml���õ�init-method��destroy-method)��
 * 	2��ע�ⷽʽ������JSR-250��@PostConstruct��@PreDestroy��
 * @author Mask
 *
 */
public class BeanWayService {
	public void init() {
		System.out.println("@Bean-init-method");
	}
	
	public BeanWayService() {
		super();
		System.out.println("��ʼ�����캯��-BeanWayService");
	}
	
	public void destroy() {
		System.out.println("@Bean-destroy-method");
	}
}
