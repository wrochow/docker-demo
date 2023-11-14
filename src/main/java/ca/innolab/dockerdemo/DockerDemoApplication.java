package ca.innolab.dockerdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DockerDemoApplication.class, args);
		System.out.println("Hello Docker World!");
	}
	@GetMapping(path="/", produces="text/plain")
	public String index() {
		return "Hello Docker World!";
	}

}
