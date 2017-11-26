package server.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import server.Calculator;
@WebService(serviceName="calculator_service")
//extend SpringBeanAutowiringSupport to allow injection of Spring beans into JAX-WS runtime managed endpoint
public class CalculatorServiceEndpoint extends SpringBeanAutowiringSupport{
	
	@Autowired
	private Calculator calculatorService;
	
	@WebMethod
	int sum(int a, int b){
		//delegate to calculatorService
		return calculatorService.sum(a, b);
	}
}
