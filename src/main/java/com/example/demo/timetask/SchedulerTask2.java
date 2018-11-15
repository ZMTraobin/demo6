package com.example.demo.timetask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask2 {

	@Scheduled(fixedRate = 6000)
	public void proccess() {
		System.out.println("查看一次时间：");
	}
}
