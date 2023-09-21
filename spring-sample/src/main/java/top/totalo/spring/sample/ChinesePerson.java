package top.totalo.spring.sample;

import org.springframework.stereotype.Service;

@Service
public class ChinesePerson implements IPersonService {
	
	@Override
	public void speak() {
		System.out.println("你好");
	}
}
