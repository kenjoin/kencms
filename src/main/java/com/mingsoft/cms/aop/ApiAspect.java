package com.mingsoft.cms.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
@Component
public class ApiAspect {

	private static final Logger logger = LoggerFactory.getLogger(ApiAspect.class);
	
	@Around(value = "execution(public * *.mingsoft.cms..action.*Action.*(..)) && @annotation(annotation)")
	public Object doApi(ProceedingJoinPoint point, RequestMapping annotation) throws Throwable {
	
		String className = point.getSignature().getDeclaringTypeName(),
				methodName = point.getSignature().getName();
		
		logger.info("Before, The method: {}, the name: {}", className, methodName);
		
		Object result = point.proceed();
		
		logger.info("The result: {}", result);
		
		logger.info("After, The method: {}, the name: {}", className, methodName);
		
		return result;
	}

	
	
//	@Pointcut("execution(* *..*(..))")
	public void anyoneMethod() {
		
	}
	
//	@AfterThrowing(pointcut = "anyoneMethod()", throwing = "e")
	public void hanlderAnyException(Exception e) {

		
		logger.error("this error:", e);
		
	}
	
	
}
