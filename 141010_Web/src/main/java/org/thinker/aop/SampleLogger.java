package org.thinker.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleLogger {
	
	private static Logger logger = LoggerFactory.getLogger("SampleLogger");
	
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
		
		Object obj;
		
		long start = System.currentTimeMillis();
		
		logger.info("----------------");
		logger.info(joinPoint.getKind());
		logger.info("----------------");
		logger.info(joinPoint.getArgs().toString());
		logger.info("----------------");
		logger.info(joinPoint.getSignature().toString());
		logger.info("----------------");
		logger.info(joinPoint.getTarget().toString());
		//method invoke
		obj = joinPoint.proceed();
		
		long end = System.currentTimeMillis();

		logger.info("----------------" + (end-start));
		logger.info("----------------");
		
		return obj;
	}

}
