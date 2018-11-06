package com.wisely.highlight_spring4.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wisely.highlight_spring4.ch3.fortest.TestConfig;

/**
 * 1��SpringJUnit4ClassRunner��JUnit�������ṩSpringTestContext Framework�Ĺ��ܡ�
 * 2��@ContextConfiguration������������ApplicationContext������classes������������������
 * 3��@ActiveProfiles�����������profile��
 * 4����ʹ����ͨ��@Autowiredע��Bean
 * 5�����Դ��룬ͨ��JUnit��Assert��У�����Ƿ��Ԥ��һ�¡�
 * @author Mask
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanInterationTests {
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject(){
		String expected = "from production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
}
