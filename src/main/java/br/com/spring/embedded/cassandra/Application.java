package br.com.spring.embedded.cassandra;

import org.apache.cassandra.service.CassandraDaemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = Application.class)
public class Application implements CommandLineRunner {

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(final String... args) throws Exception {
    final CassandraDaemon cassandraDaemon = new CassandraDaemon();

    cassandraDaemon.applyConfig();
    cassandraDaemon.init(null);
    cassandraDaemon.start();
  }

}
