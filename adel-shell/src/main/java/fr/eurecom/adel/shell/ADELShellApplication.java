package fr.eurecom.adel.shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("fr.eurecom.adel")
public class ADELShellApplication {
	public static void main(final String... args) {
    SpringApplication.run(ADELShellApplication.class, args);
	}
}
