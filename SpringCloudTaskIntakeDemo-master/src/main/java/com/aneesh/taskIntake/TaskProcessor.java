package com.aneesh.taskIntake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class TaskProcessor {

	
	@Autowired
	private Source source;
	
	public void publishRequest(String payload) {
		
		//where to find the class. 
		String url = "maven://com.aneesh.microservice:task:jar:0.0.1-SNAPSHOT";
		
		List<String> input = new ArrayList<String>(Arrays.asList(payload.split(",")));
		
		//this will now launch the request
		TaskLaunchRequest request = new TaskLaunchRequest(url, input, null, null, null);
		
		System.out.println("Created a launch request");
		
		//sending message to the source (source is the rabbitmq exchange)
		GenericMessage<TaskLaunchRequest> message = new GenericMessage<TaskLaunchRequest>(request);
		this.source.output().send(message);
		
		
	}
}
