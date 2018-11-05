package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;
/**
 * 	Spring���¼���Application Event��ΪBean��Bean֮�����Ϣͨ���ṩ��֧�֡�
 * 	��Bean������һ�������ϣ������һ��Bean֪������������Ӧ�Ĵ���
 * 	��ʱ���Ǿ���Ҫ����һ��Bean������ǰBean�����͵��¼�
 * 	Spring���¼���Ҫ��ѭ�������̣�
 * 	1���Զ����¼�������ApplicationEvent��
 * 	2�������¼���������ʵ��ApplicationListener��
 * 	3��ʹ�����������¼���
 * @author Mask
 *
 */
public class DemoEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
