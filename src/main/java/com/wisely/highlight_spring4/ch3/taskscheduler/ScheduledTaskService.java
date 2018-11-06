package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 1��ͨ��@Scheduled�����÷����Ǽƻ�����ʹ��fixedRate����ÿ���̶�ʱ��ִ��
 * 2��ʹ��cron���Կɰ���ָ��ʱ��ִ�У�����ָ����ÿ��20��30��ִ�У�
 * cron��UNIX����UNIX��Linux��ϵͳ�µĶ�ʱ����
 * @author Mask
 *
 */
@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("ÿ��������ִ��һ�� " + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 30 20 ? * *" )
	public void fixTimeExecution() {
		System.out.println("��ָ��ʱ�� " + dateFormat.format(new Date()));
	}
}
