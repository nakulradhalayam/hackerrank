package com.hackerrank.algorithms;

import java.util.HashMap;

public class MyClass {
	public static void main(String []args){
        HashMap<String, Object> pParamsTrackingHistory = new HashMap<String, Object>();
        pParamsTrackingHistory.put("Hi",1);
        Integer onboardingProcessStartDelay = (Integer) pParamsTrackingHistory.get("PROCESS_START_DELAY");
        //System.out.println(onboardingProcessStartDelay.doubleValue());
        
        MyEventConsumer consumer = new MyEventConsumer() {
			
			int delay=10;
			public void consume() {
				System.out.println("Hi"+delay);
				
			}
		};
		consumer.consume();
     }
}
