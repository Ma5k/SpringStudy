package com.wisely.highlight_spring4.ch2.perpost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @PostConstruct���ڹ������ִ�����֮��ִ��
 * @PreDestroy����bean����֮ǰִ��
 * @author Mask
 *
 */
public class JSR250WayService {
	@PostConstruct
	public void init() {
		System.out.println("jsr250-init-method");
	}
	
	public JSR250WayService() {
		super();
		System.out.println("��ʼ�����캯��-JSR250WayService");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("jsr250-destroy-method");
	}
}
