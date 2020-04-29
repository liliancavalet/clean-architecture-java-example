# References

<!-- vscode-markdown-toc -->
* [Clean Architecture](#CleanArchitecture)
	* [Builder Pattern](#BuilderPattern)
	* [Spring-Boot](#Spring-Boot)
* [JSON](#JSON)
* [Maven](#Maven)
* [Test](#Test)
	* [jUnit5](#jUnit5)
* [Java](#Java)
	* [Dependency Injection](#DependencyInjection)
	* [Lombok](#Lombok)
	* [Modules](#Modules)
	* [ModelMapper](#ModelMapper)
	* [Time](#Time)
* [Spring-Boot](#Spring-Boot-1)
	* [Maven](#Maven-1)
	* [Beans](#Beans)
	* [Rest](#Rest)
	* [Controller](#Controller)
	* [Logging](#Logging)
	* [JSON](#JSON-1)
	* [Test](#Test-1)

<!-- vscode-markdown-toc-config
	numbering=false
	autoSave=true
	/vscode-markdown-toc-config -->
<!-- /vscode-markdown-toc -->

## <a name='CleanArchitecture'></a>Clean Architecture

- https://www.slideshare.net/mattiabattiston/real-life-clean-architecture-61242830
  - https://github.com/mattia-battiston/clean-architecture-example
- https://jmgarridopaz.github.io/content/hexagonalarchitecture.html
- https://pusher.com/tutorials/clean-architecture-introduction
- https://github.com/eliostvs/clean-architecture-delivery-example
  - https://softwareengineering.stackexchange.com/a/373524
- [Robert C. Martin - Clean Architecture](https://vimeo.com/43612849)
- [Why you need Use Cases/Interactors](https://proandroiddev.com/why-you-need-use-cases-interactors-142e8a6fe576)
- https://hackernoon.com/clean-architecture-example-in-kotlin-9f23169219be
- https://www.raywenderlich.com/3595916-clean-architecture-tutorial-for-android-getting-started
  - https://github.com/dmilicic/Android-Clean-Boilerplate

### <a name='BuilderPattern'></a>Builder Pattern

- https://www.geeksforgeeks.org/builder-pattern-in-java/
- https://www.journaldev.com/1425/builder-design-pattern-in-java

### <a name='Spring-Boot'></a>Spring-Boot

- https://medium.com/slalom-build/clean-architecture-with-java-11-f78bba431041
  - https://github.com/carlphilipp/clean-architecture-example
- https://reflectoring.io/java-components-clean-boundaries/
- https://imasters.com.br/back-end/introducao-clean-architecture
- https://medium.com/@icarovictor/the-clean-architecture-54df8a46dba1

## <a name='JSON'></a>JSON

- https://jsonschema.net/

## <a name='Maven'></a>Maven

- http://maven.apache.org/maven-ci-friendly.html
  - https://jeanchristophegay.com/en/posts/maven-unique-version-multi-modules-build/
- https://www.baeldung.com/maven-java-version
  - https://medium.com/criciumadev/its-time-migrating-to-java-11-5eb3868354f9
- https://mkyong.com/maven/how-to-create-a-java-project-with-maven/
  - https://github.com/mkyong/maven-examples

## <a name='Test'></a>Test

### <a name='jUnit5'></a>jUnit5

- https://www.baeldung.com/junit-5
- https://www.baeldung.com/mockito-junit-5-extension
- https://mkyong.com/spring-boot/spring-boot-junit-5-mockito/
- https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-nested-tests/
- http://sangsoonam.github.io/2019/02/04/mockito-doreturn-vs-thenreturn.html
- https://www.baeldung.com/junit-assert-exception
- https://www.baeldung.com/mockito-verify
- https://www.baeldung.com/mockito-junit-5-extension

## <a name='Java'></a>Java

### <a name='DependencyInjection'></a>Dependency Injection

- https://www.vogella.com/tutorials/DependencyInjection/article.html
- https://javarevisited.blogspot.com/2017/04/difference-between-autowired-and-inject-annotation-in-spring-framework.html
- https://www.baeldung.com/spring-annotations-resource-inject-autowire
- https://mvnrepository.com/artifact/javax.inject/javax.inject/1

### <a name='Lombok'></a>Lombok

- https://projectlombok.org/setup/maven
  - https://github.com/MCMicS/simple-lombok
  - https://medium.com/@Leejjon_net/youll-have-this-problems-when-you-add-lombok-to-a-modular-java-11-micro-service-832f55911bc5
- https://www.baeldung.com/lombok-ide
- http://errataobscura.blogspot.com/2019/03/jsonserialize-and-jsondeserialize-with.html

### <a name='Modules'></a>Modules

- https://dzone.com/articles/java-9-module-services
- https://www.baeldung.com/project-jigsaw-java-modularity
- https://medium.com/slalom-build/clean-architecture-with-java-11-f78bba431041
- https://www.oracle.com/corporate/features/understanding-java-9-modules.html

### <a name='ModelMapper'></a>ModelMapper

- https://github.com/modelmapper/modelmapper/issues/265

### <a name='Time'></a>Time

- http://apiux.com/2013/03/20/5-laws-api-dates-and-times/
- https://www.codebyamir.com/blog/add-a-timezone-to-localdatetime-with-zoneddatetime-in-java-8
- https://stackoverflow.com/a/32443004
- https://www.moesif.com/blog/technical/timestamp/manage-datetime-timestamp-timezones-in-api/
- https://mincong.io/2017/02/16/convert-date-to-string-in-java/

## <a name='Spring-Boot-1'></a>Spring-Boot

- https://start.spring.io/
- https://spring.io/guides/gs/spring-boot/
- https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html
- https://github.com/eugenp/tutorials/blob/master/spring-boot-rest/src/main/java/com/baeldung/springpagination/controller/PostRestController.java

### <a name='Maven-1'></a>Maven

- https://docs.spring.io/spring-boot/docs/current/maven-plugin/examples/run-profiles.html

### <a name='Beans'></a>Beans

- https://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/creating-bean-definitions.html

### <a name='Rest'></a>Rest

- https://spring.io/guides/tutorials/rest/
- https://www.baeldung.com/rest-with-spring-series
  - https://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application

### <a name='Controller'></a>Controller

- https://www.baeldung.com/spring-controller-vs-restcontroller

### <a name='Logging'></a>Logging

- https://stackoverflow.com/a/55338237
  - https://dzone.com/articles/logger-injection-with-springs-injectionpoint

### <a name='JSON-1'></a>JSON

- https://www.baeldung.com/jackson-deserialize-immutable-objects
- https://www.baeldung.com/jackson-map
- https://codeboje.de/jackson-java-8-datetime-handling/
- https://github.com/FasterXML/jackson-modules-java8

### <a name='Test-1'></a>Test

- https://spring.io/guides/gs/testing-web/
- https://reflectoring.io/unit-testing-spring-boot/
- https://developer.okta.com/blog/2019/03/28/test-java-spring-boot-junit5
- https://www.baeldung.com/java-spring-mockito-mock-mockbean
- https://howtodoinjava.com/spring-boot2/testing/spring-mockbean-annotation/
- https://www.journaldev.com/21876/mockito-argument-matchers-any-eq
- https://www.baeldung.com/mockito-spy
- https://github.com/spring-projects/spring-framework/blob/master/spring-test/src/test/java/org/springframework/test/web/servlet/samples/standalone/AsyncTests.java