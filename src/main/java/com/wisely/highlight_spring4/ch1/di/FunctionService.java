package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;
/**
 * 1��ʹ��@Serviceע��������ǰFunctionService����Spring�����һ��Bean��
 * ���У�ʹ��@Component��@Service��@Repository��@Controller�ǵ�Ч�ģ��ɸ�����Ҫѡ��
 * @author Mask
 *
 */
@Service
public class FunctionService {
	public String sayHello(String word) {
		return "Hello " + word + " !";
	}
}
