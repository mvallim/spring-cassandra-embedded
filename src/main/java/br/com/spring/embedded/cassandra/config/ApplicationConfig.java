package br.com.spring.embedded.cassandra.config;

import java.io.IOException;

import org.apache.cassandra.service.CassandraDaemon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ApplicationConfig {

  @Bean
  public CassandraDaemon embeddedCassandraService() throws IOException {

    final CassandraDaemon cassandraDaemon = CassandraDaemon.getInstanceForTesting();

    cassandraDaemon.applyConfig();
    cassandraDaemon.init(null);
    cassandraDaemon.start();

    return cassandraDaemon;

  }

}
