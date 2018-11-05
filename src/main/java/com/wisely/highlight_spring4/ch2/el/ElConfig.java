package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * 1��ע����ͨ�ַ���
 * 2��ע�����ϵͳ����
 * 3��ע����ʽ���
 * 4��ע������bean����
 * 5��ע���ļ���Դ
 * 6��ע����ַ��Դ
 * 7��ע�������ļ�
 * 	ע�����������ʹ��@PropertySourceָ���ļ���ַ����ʹ��@Valueע�룬
 * 	��Ҫ����һ��PropertySourcesPlaceholderConfigurer��bean��
 * 	ע�⣬@Value("${book.name}")ʹ�õ���"$"��������"#".
 * 	ע��Properties�����Դ�Environment�л��
 * @author Mask
 *
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties")
public class ElConfig {
	
	@Value("I Love You!")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0}")
	private double randomNumber;
	
	@Value("#{demoService.another}")
	private String fromAnother;
	
	@Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt")
	private Resource testFile;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${book.name}")
	private String bookName;
	
	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
