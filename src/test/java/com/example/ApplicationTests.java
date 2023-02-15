package com.example;

import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		
		// Se obtienen las variables de entorno (Clave - Valor)
		// Se recorren con un forEach
		System.getenv().forEach(
			(key, value) -> System.out.println(key + "\t" + value)
		);
	}

}
