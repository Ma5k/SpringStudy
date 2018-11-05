package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Spring֧��AspectJ��ע��ʽ������
 * 1��ʹ��@Aspect������һ������
 * 2��ʹ��@After��@Before��@Around���彨�ԣ�advice������ֱ�ӽ����ع����е㣩��Ϊ������
 * 3������@After��@Before��@Around���������ع���Ϊ�е㣨PointCut����Ϊ��ʹ�е㸴�ã�
 * 	��ʹ��@PointCutר�Ŷ������ع���Ȼ����@After��@Before��@Around�Ĳ����е��á�
 * 4�����з���������ÿһ�������ش�Ϊ���ӵ㣨JoinPoint����
 * 	ע�Ȿ����û�й��ܵģ��ͺ�xmlһ����ע���xml����һ��Ԫ���ݣ�Ԫ���ݼ��������ݵ����ݣ��������ν�����á�
 * 	ע��Ĺ�������ʹ�����ע��ĵط���
 * @author Mask
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	String name();
}
