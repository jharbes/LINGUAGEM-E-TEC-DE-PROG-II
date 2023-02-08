package com.jharbes.springid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jharbes.springid.services.PayService;

@SpringBootApplication
public class SpringInjecaoDependenciaApplication implements CommandLineRunner {
	
	@Autowired
	private PayService payService; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringInjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Resultado = " + payService.finalPrice(300.0, "SP"));
	}

}
