# spring-cassandra-embedded

[![Build Status](https://travis-ci.org/mvallim/spring-cassandra-embedded.svg?branch=master)](https://travis-ci.org/mvallim/spring-cassandra-embedded)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=spring-cassandra-embedded&metric=alert_status)](https://sonarcloud.io/dashboard?id=spring-cassandra-embedded)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=spring-cassandra-embedded&metric=coverage)](https://sonarcloud.io/dashboard?id=spring-cassandra-embedded)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.mvallim/spring-cassandra-embedded/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.mvallim/spring-cassandra-embedded)
[![Hex.pm](https://img.shields.io/hexpm/l/plug.svg)](http://www.apache.org/licenses/LICENSE-2.0)

## 1. Quick Start

This chapter will show you how to get started run Cassandra embedded.

### 1.1 Prerequisite

Before run `spring-cassandra-embedded`, you must do download the last version of `spring-cassandra-embedded` using maven cli.

1. Download artifact

   ```shell
   mvn dependency:get \
       -DremoteRepositories=http://repo1.maven.org/maven2/ \
       -DgroupId=com.github.mvallim \
       -DartifactId=spring-cassandra-embedded \
       -Dversion=0.0.4 \
       -Dtransitive=false
   ```

### 1.2 Run

1. Run embedded Cassandra

   ```shell
   java -jar \
	-Dcassandra.storagedir=/tmp/cassandra \
	-Dcassandra.jmx.local.port=9043 \
	~/.m2/repository/com/github/mvallim/spring-cassandra-embedded/0.0.4/spring-cassandra-embedded-0.0.4.jar
   ```

   Output should be

   ```text
   Application........: spring-cassandra-embedded:0.0.4
   Application Listen.: localhost:9042
   Cassandra Version..: 3.11.6
   ```

### 1.3 Check ports

1. Check the application ports

   1. **Linux**

      Run this command

      ```shell
      netstat -plnt
      ```

      Output should be

      ```text
      (Not all processes could be identified, non-owned process info
       will not be shown, you would have to be root to see it all.)
      Active Internet connections (only servers)
      Proto Recv-Q Send-Q Local Address           Foreign Address         State       PID/Program name
      tcp        0      0 127.0.0.1:9042          0.0.0.0:*               LISTEN      18949/java
      tcp        0      0 127.0.0.1:38021         0.0.0.0:*               LISTEN      3518/java
      tcp        0      0 0.0.0.0:8081            0.0.0.0:*               LISTEN      18949/java
      tcp        0      0 0.0.0.0:38417           0.0.0.0:*               LISTEN      3518/java
      tcp        0      0 127.0.0.1:53            0.0.0.0:*               LISTEN      -
      tcp        0      0 127.0.0.1:41623         0.0.0.0:*               LISTEN      15189/code
      tcp        0      0 127.0.0.1:631           0.0.0.0:*               LISTEN      -
      tcp        0      0 127.0.0.1:43097         0.0.0.0:*               LISTEN      18949/java
      ```

   1. **Windows**

      Run this command

      ```shell
      netstat -ant -p tcp | findstr LISTENING
      ```

      Output should be

      ```text
      TCP    127.0.0.1:9042        0.0.0.0:0       LISTENING   InHost
      ```

   You can see port **9042**. (Cassandra server respectivaly)


# Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [GitHub](https://github.com/mvallim/spring-cassadra-embedded) for versioning. For the versions available, see the [tags on this repository](https://github.com/mvallim/spring-cassadra-embedded/tags).

## Authors

* **Marcos Vallim** - *Initial work, Development, Test, Documentation* - [mvallim](https://github.com/mvallim)
* **Paulo Sergio** - *Initial work, Development, Test, Documentation* - [pspjnsu](https://github.com/pspjnsu)

See also the list of [contributors](CONTRIBUTORS.txt) who participated in this project.

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details
