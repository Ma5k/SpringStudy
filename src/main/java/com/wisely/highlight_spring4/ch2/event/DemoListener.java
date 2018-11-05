package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 1��ʵ��ApplicationListener�ӿڣ���ָ���������¼�����
 * 2��ʹ��onApplicationEvent��������Ϣ���н��ܴ���
 * @author Mask
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
	@Override
	public void onApplicationEvent(DemoEvent event) {
		
		String msg = event.getMsg();
		
		System.out.println("��(bean-demoListener)���յ���bean-demoPublisher��������Ϣ��" + msg);
	}

}
