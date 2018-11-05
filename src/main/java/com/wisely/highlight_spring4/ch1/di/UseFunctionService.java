package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 1��ʹ��@Serviceע��������ǰUseFunctionService����Spring�����һ��Bean
 * 2��ʹ��@Autowired��FunctionService��ʵ��Beanע�뵽UseFunctionService�У�
 * ��UseFunctionService�߱�FunctionService�Ĺ��ܣ��˴�ʹ��JSR-330��@Injectע�����JSR-250��@Resourceע���ǵ�Ч��
 * @author Mask
 *
 */
@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	
	public String SayHello(String word) {
		return functionService.sayHello(word);
	}
}
