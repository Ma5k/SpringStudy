package com.wisely.highlight_spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring������ע������������������е�Bean��Spring�����Ĵ�����û����ʶ�ġ�
 * ������Խ���������滻�ɱ����������Google Guice������Bean֮�����϶Ⱥܵ͡�
 * 	����ʵ����Ŀ�У��㲻�ɱ����Ҫ�õ�Spring��������Ĺ�����Դ����ʱ���Bean����Ҫ��ʶ��Spring�����Ĵ��ڣ�
 * 	���ܵ���Spring���ṩ����Դ���������ν��Spring Aware��
 * 	��ʵSpring Aware��������Spring�����������ڲ�ʹ�õģ���ʹ����Spring Aware�����Bean�����Spring�����ϡ�
 * 
 * Spring Aware��Ŀ����Ϊ����Bean���Spring�����ķ�����ΪApplicationContext�ӿڼ�����MessageSource�ӿڡ�
 * ApplicationEventPulisher�ӿں�ResourceLoader�ӿڣ�����Bean�̳�ApplicationContextAware���Ի���������еķ���
 * ��ԭ�������ǻ����õ�ʲô�ӿڣ���ʵ��ʲô�ӿڡ�
 * @author Mask
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		
		context.close();
	}
}
