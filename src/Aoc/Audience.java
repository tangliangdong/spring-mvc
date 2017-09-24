package Aoc;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution (* Aoc.Performer.perform(..))")
	
	public void perform(){
		
	}
	@Before("perform()")
	public void tekeSeat(){
		System.out.println("找椅子坐下");
	}
	@Before("perform()")
	public void turnOffPhone(){
		System.out.println("关闭手机");
	}
	@AfterReturning("perform()")
	public void handClap() {
		System.out.println("鼓掌......");
	}
	@AfterThrowing("perform()")
	public void complaint() {
		System.out.println("投诉，要求退款...");
	}
}
