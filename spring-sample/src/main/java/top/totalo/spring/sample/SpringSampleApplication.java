package top.totalo.spring.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("top.totalo.spring.sample.**")
@EnableAspectJAutoProxy
public class SpringSampleApplication { 
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringSampleApplication.class
		);
		
		IPersonService personService = context.getBean(IPersonService.class);
		personService.speak();
		// 测试循环依赖
		AService aService = context.getBean(AService.class);
		
	}
}