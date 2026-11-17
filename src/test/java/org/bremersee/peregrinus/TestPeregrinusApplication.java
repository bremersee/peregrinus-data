package org.bremersee.peregrinus;

import org.springframework.boot.SpringApplication;

public class TestPeregrinusApplication {

	public static void main(String[] args) {
		SpringApplication.from(PeregrinusApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
