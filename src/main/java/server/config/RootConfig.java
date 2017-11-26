package server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapServiceExporter;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import server.Calculator;
import server.CalculatorImpl;

@Configuration
public class RootConfig {
	@Bean
	public Calculator calculator(){
		return new CalculatorImpl();
	}
	
	@Bean
	public HttpInvokerServiceExporter exportedCalculatorService(Calculator calculator){
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(calculator);
		exporter.setServiceInterface(Calculator.class);
		return exporter;
	}
	
}
