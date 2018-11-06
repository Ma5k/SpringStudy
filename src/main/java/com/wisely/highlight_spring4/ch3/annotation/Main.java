package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ��Spring2��ʼ��Ϊ����ӦJDK1.5�Ƴ���ע�⹦�ܣ�Spring��ʼ��������ע�������xml���á�
 * Spring��ע����Ҫ��������ע��Bean������������ã�@Transactional����
 * ����ע��Ĵ���ʹ�ã�������ͬ�Ķ��ע���õ��������У�
 * ���൱���¡��������ν��ģ����룬��Spring���ԭ����Ҫ�����Ĵ��롣
 * 
 * ��νԪע����ʵ���ǿ���ע�⵽���ע���ϵ�ע�⣬
 * ��ע���ע���֮Ϊ���ע�⡢�ǿ����е��ֿڣ���Ậ������Ҫ����
 * ���ע��߱�Ԫע��Ĺ��ܡ�Spring�ĺܶ�ע�ⶼ������ΪԪע�⣬
 * ����Spring�����Ѿ��кܶ����ע�⣬��@Configuration����һ�����@Componentע�⣬
 * �����������ʵҲ��һ��Bean��
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
