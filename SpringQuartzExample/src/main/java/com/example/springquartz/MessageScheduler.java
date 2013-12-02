package com.example.springquartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MessageScheduler extends QuartzJobBean {
	
	@Autowired
	MessagePrinter messagePrinter;

	public void setMessagePrinter(MessagePrinter messagePrinter) {
		this.messagePrinter = messagePrinter;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		messagePrinter.pritnMessage();
	}

}
