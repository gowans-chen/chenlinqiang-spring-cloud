package cn.net.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author chenlinqiang
 * 2020年3月28日
 * 
 *
 */
@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
public class ClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServerApplication.class, args);
	}
}
