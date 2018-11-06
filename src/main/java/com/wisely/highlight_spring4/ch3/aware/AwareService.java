package com.wisely.highlight_spring4.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * 1��ʵ��BeanNameAware��ResourceLoaderAware�ӿڣ����Bean���ƺ���Դ���صķ���
 * 2��ʵ��ResourceLoaderAware��Ҫ��дsetResourceLoader������
 * 3��ʵ��BeanNameAware��Ҫ��дsetBeanName������
 * @author Mask
 *
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	private String beanName;
	private ResourceLoader loader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void outputResult() {
		System.out.println("Bean������Ϊ��" + beanName);
		Resource resource = loader.getResource("classpath:com/wisely/highlight_spring4/ch3/aware/test.txt");
		try {
			System.out.println("ResourceLoader���ص��ļ�����Ϊ��" + IOUtils.toString(resource.getInputStream()));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
