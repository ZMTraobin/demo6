package com.example.demo.timetask;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Scheduled(cron = "*/6 * * * * ?")
	public void proccess() {
		Date date = new Date();
		System.out.println("现在时间为："+format.format(date));
	}
	
}
