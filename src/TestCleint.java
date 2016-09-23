
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baizhi.entity.BasicUser;
import com.baizhi.service.IUserService;

public class TestCleint {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		final IUserService bean = ctx.getBean(IUserService.class);

		//认证
		//String result = login(bean);
		//String result = bean.getTicket("610224874@qq.com", "OJ4sAnQ0FT05WbfImCdxHqZwzOZWteU07ACntJxCT2e6BGmmHkD1sNO8cceMsSjLlcsmm4W8ThB7\r\ngG7uWq2Whmpr70yx4iLB9aeIoS+PFqo=", "app1");
		//String result = bean.checkToken("610224874@qq.com", "OJ4sAnQ0FT05WbfImCdxHqZwzOZWteU07ACntJxCT2e6BGmmHkD1sNO8cceMsSjLlcsmm4W8ThB7\r\ngG7uWq2Whmpr70yx4iLB9aeIoS+PFqo=", "app2");
		//String result = bean.getTicket("610224874@qq.com", "OJ4sAnQ0FT05WbfImCdxHqZwzOZWteU07ACntJxCT2e6BGmmHkD1sNO8cceMsSjLlcsmm4W8ThB7\r\ngG7uWq2Whmpr70yx4iLB9aeIoS+PFqo=", "app2");
		String result = bean.logout("610224874@qq.com", "app1");
		System.out.println("接收到服务器返回："+result);

		ctx.close();
	}
	
	private static String login(IUserService bean){
		return bean.login("610224874@qq.com", "123456","app1");
	}
	
	

}
