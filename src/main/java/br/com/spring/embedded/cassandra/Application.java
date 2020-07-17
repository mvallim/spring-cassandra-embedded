package br.com.spring.embedded.cassandra;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = Application.class)
public class Application {

  public static void main(final String[] args) throws IOException {
    SpringApplication.run(Application.class, args);
  }

}
