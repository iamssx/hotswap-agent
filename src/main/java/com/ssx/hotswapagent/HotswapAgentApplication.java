package com.ssx.hotswapagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class HotswapAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotswapAgentApplication.class, args);

	}
}
