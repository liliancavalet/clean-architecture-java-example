# Central Queue

Generic queue management system

<!-- https://marketplace.visualstudio.com/items?itemName=joffreykern.markdown-toc -->
<!-- vscode-markdown-toc -->
* [Clear Architecture](#ClearArchitecture)
	* [Why?](#Why)
		* [Issues](#Issues)
		* [Benefits](#Benefits)
		* [Cost](#Cost)
	* [Structure](#Structure)
* [Usage](#Usage)
	* [Build](#Build)
	* [Run](#Run)
	* [API Tests](#APITests)
* [References](#References)

<!-- vscode-markdown-toc-config
	numbering=false
	autoSave=false
	/vscode-markdown-toc-config -->
<!-- /vscode-markdown-toc -->

## <a name='ClearArchitecture'></a>Clear Architecture

> The center of your application is not the database. Nor is it one or more of the frameworks you may be using. *The center of your application is the use cases of your application* - Unclebob ([source](https://blog.cleancoder.com/uncle-bob/2012/05/15/NODB.html))

### <a name='Why'></a>Why?

([source](https://github.com/mattia-battiston/clean-architecture-example#why-clean-architecture))

#### <a name='Issues'></a>Issues

Clean architecture helps us solve, or at least mitigate, these common problems with architecture:

- **Decisions are taken too early**, often at the beginning of a project, when we know the least about the problem that we have to solve
- **It's hard to change**, so when we discover new requirements we have to decide if we want to hack them in or go through an expensive and painful re-design. We all know which one usually wins. The best architectures are the ones that allow us to defer commitment to a particular solution and let us change our mind
- **It's centered around frameworks**. Frameworks are tools to be used, not architectures to be conformed to. Frameworks often require commitments from you, but they don’t commit to you. They can evolve in different directions, and then you’ll be stuck following their rules and quirks
- **It's centered around the database**. We often think about the database first, and then create a CRUD system around it. We end up using the database objects everywhere and treat everything in terms of tables, rows and columns
- **We focus on technical aspects** and when asked about our architecture we say things like “it’s servlets running in tomcat with an oracle db using spring”
- **It's hard to find things** which makes every change longer and more painful
- **Business logic is spread everywhere**, scattered across many layers, so when checking how something works our only option is to debug the whole codebase. Even worse, often it's duplicated in multiple places
- **Forces/Encourages slow, heavy tests**. Often our only choice for tests is to go through the GUI, either because the GUI has a lot of logic, or because the architecture doesn't allow us to do otherwise. This makes tests slow to run, heavy and brittle. It results in people not running them and the build beind broken often
- **Infrequent deploys** because it's hard to make changes without breaking existing functionalities. People resort to long-lived feature branches that only get integrated at the end and result in big releases, rather than small incremental ones

#### <a name='Benefits'></a>Benefits

- **Effective testing strategy** that follows the [testing pyramid](http://martinfowler.com/bliki/TestPyramid.html) and gives us a fast and reliable build
- **Frameworks are isolated** in individual modules so that when (not if) we change our mind we only have to change one place, with the rest of the app not even knowing about it
- **Independent from Database**, which is treated just like any other data provider. Our app has real use cases rather than being a CRUD system
- **Screaming architecture** a.k.a. it screams its intended usage. When you look at the package structure you get a feel for what the application does rather than seeing technical details
- **All business logic is in a use case** so it's easy to find and it's not duplicated anywhere else
- **Hard to do the wrong thing** because modules enforce compilation dependencies. If you try to use something that you're not meant to, the app doesn't compile
- **We're always ready to deploy** by leaving the wiring up of the object for last or by using feature flags, so we get all the benefits of continuous integration (no need for feature branches)
- **Swarming on stories** so that different pairs can easily work on the same story at the same time to complete it quicker
- **Good monolith** with clear use cases that you can split in microservices later one, once you've learnt more about them

#### <a name='Cost'></a>Cost

- **Perceived duplication of code**. Entities might be represented differently when used in business logic, when dealing with the database and when presenting them in a json format. You might feel like you're duplicating code, but you're actually favouring decoupling over DRY
- **You need interesting business logic** to "justify" the structure. If all you do in your use case is a one-line method to read or save from a database, then maybe you can get away with something simpler

### <a name='Structure'></a>Structure

![Unclie Bob's Clean Architecture](./docs/ca_unclebob.svg)

- **Core**: Business Logic
  - **Entities**
    - Represent your domain object
    - Apply only logic that is applicable in general to the whole entity (e.g. validating the format of an hostname)
    - Plain java objects: no frameworks, no annotations
  - **Use Cases**
    - Represent your business actions, it’s what you can do with the application. Expect one use case for each business action
    - Pure business logic, plain java (expect maybe some utils libraries like StringUtils)
    - Define interfaces for the data that they need in order to apply some logic. One or more dataproviders will implement the interface, but the use case doesn’t know where the data is coming from
    - The use case doesn't know who triggered it and how the results are going to be presented (e.g. could be on a web page, or returned as json, or simply logged, etc.)
    - Throws business exceptions
- **Dataproviders**: Retrieve and store information
  - Retrieve and store data from and to a number of sources (database, network devices, file system, 3rd parties, etc.)
  - Implement the interfaces defined by the use case
  - Use whatever framework is most appropriate (they are going to be isolated here anyway)
  - Note: if using an ORM for database access, here you'd have another set of objects in order to represent the mapping to the tables (don't use the core entities as they might be very different)
- **Entrypoints**: Access to the application
  - Are ways to interact with the application, and typically involve a delivery mechanism (e.g. REST APIs, scheduled jobs, GUI, other systems)
  - Trigger a use case and convert the result to the appropriate format for the delivery mechanism
  - A GUI would use MVC (or MVP) in here; the controller would trigger a use case
- **Configuration**: Wires everything together
  - Wires everything together
  - Frameworks (e.g. for dependency injection) are isolated here
  - Has the "dirty details" like Main class, web server configuration, datasource configuration, etc.

## <a name='Usage'></a>Usage

### <a name='Build'></a>Build

```console
$ ./mvnw clean install [-Dspring.profiles.active=dev]
```

### <a name='Run'></a>Run

```console
$ ./mvnw spring-boot:run -pl app
```

### <a name='APITests'></a>API Tests

While running:

```console
$ ./mvnw test -pl app -Dtest=KarateRunner [-DargLine="-Dapp.server.baseUrl=http://localhost:8080"]
```

## <a name='References'></a>References

- [Robert C. Martin - Clean Architecture](https://www.youtube.com/watch?v=Nltqi7ODZTM)
- [Real Life Clean Architecture](https://www.slideshare.net/mattiabattiston/real-life-clean-architecture-61242830)
  - [Clean Architecture Example (Java): Example of what clean architecture would look like](https://github.com/mattia-battiston/clean-architecture-example)
- [A example of clean architecture in Java 8 and Spring Boot 2.0](https://github.com/eliostvs/clean-architecture-delivery-example)
