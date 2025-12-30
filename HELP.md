# Getting Started

Running the application without both `spring-boot-starter-restclient` and
`spring-boot-starter-webclient` on classpath causes it to fail with an exception:
```
2025-12-30T11:35:15.029+01:00 ERROR 25022 --- [sba_sb4] [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalStateException: Failed to generate bean name for imported class 'de.codecentric.boot.admin.client.config.SpringBootAdminClientAutoConfiguration'
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.registerBeanDefinitionForImportedConfigurationClass(ConfigurationClassBeanDefinitionReader.java:172) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass(ConfigurationClassBeanDefinitionReader.java:145) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitions(ConfigurationClassBeanDefinitionReader.java:124) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:458) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:310) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:349) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:118) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:794) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:602) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.boot.web.server.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:143) ~[spring-boot-web-server-4.0.1.jar:4.0.1]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:756) ~[spring-boot-4.0.1.jar:4.0.1]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:445) ~[spring-boot-4.0.1.jar:4.0.1]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:321) ~[spring-boot-4.0.1.jar:4.0.1]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1365) ~[spring-boot-4.0.1.jar:4.0.1]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354) ~[spring-boot-4.0.1.jar:4.0.1]
	at com.example.sba_sb4.SbaSb4Application.main(SbaSb4Application.java:10) ~[classes/:na]
Caused by: java.lang.IllegalArgumentException: Could not find class [org.springframework.boot.webclient.autoconfigure.WebClientAutoConfiguration]
	at org.springframework.util.ClassUtils.resolveClassName(ClassUtils.java:353) ~[spring-core-7.0.2.jar:7.0.2]
	at org.springframework.core.annotation.TypeMappedAnnotation.adapt(TypeMappedAnnotation.java:451) ~[spring-core-7.0.2.jar:7.0.2]
	at org.springframework.core.annotation.TypeMappedAnnotation.getValue(TypeMappedAnnotation.java:384) ~[spring-core-7.0.2.jar:7.0.2]
	at org.springframework.core.annotation.TypeMappedAnnotation.asMap(TypeMappedAnnotation.java:273) ~[spring-core-7.0.2.jar:7.0.2]
	at org.springframework.core.annotation.AbstractMergedAnnotation.asAnnotationAttributes(AbstractMergedAnnotation.java:191) ~[spring-core-7.0.2.jar:7.0.2]
	at org.springframework.context.annotation.AnnotationBeanNameGenerator.determineBeanNameFromAnnotation(AnnotationBeanNameGenerator.java:143) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.annotation.AnnotationBeanNameGenerator.generateBeanName(AnnotationBeanNameGenerator.java:110) ~[spring-context-7.0.2.jar:7.0.2]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.registerBeanDefinitionForImportedConfigurationClass(ConfigurationClassBeanDefinitionReader.java:168) ~[spring-context-7.0.2.jar:7.0.2]
	... 15 common frames omitted
Caused by: java.lang.ClassNotFoundException: org.springframework.boot.webclient.autoconfigure.WebClientAutoConfiguration
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:580) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:490) ~[na:na]
	at java.base/java.lang.Class.forName0(Native Method) ~[na:na]
	at java.base/java.lang.Class.forName(Class.java:547) ~[na:na]
	at org.springframework.util.ClassUtils.forName(ClassUtils.java:302) ~[spring-core-7.0.2.jar:7.0.2]
	at org.springframework.util.ClassUtils.resolveClassName(ClassUtils.java:343) ~[spring-core-7.0.2.jar:7.0.2]
	... 22 common frames omitted
```
