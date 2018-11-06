package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 1��ͨ��@Asyncע������÷����Ǹ��첽���������ע�����༶��������������еķ��������첽������
 * ������ķ�����ע��ʹ��ThreadPoolTaskExecutor��ΪTaskExecutor
 * @author Mask
 *
 */
@Service
public class AsyncTaskService {
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("ִ���첽����" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("ִ���첽����+1: " + (i + 1));
	}
}
