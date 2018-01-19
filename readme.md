# Kotlin 1.2.20 with Spring Boot 2.0.0.M7 and @ConfigurationProperties

This tiny example shows a bug when upgrading from Kotlin 1.2.10 to 1.2.20

When build with 1.2.20 this error occurs
```
Caused by: org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'larmic' to de.larmic.kotlin.bug.Configuration
	at org.springframework.boot.context.properties.bind.Binder.handleBindError(Binder.java:227)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:203)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:187)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:169)
	at org.springframework.boot.context.properties.ConfigurationPropertiesBinder.bind(ConfigurationPropertiesBinder.java:77)
	at org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor.postProcessBeforeInitialization(ConfigurationPropertiesBindingPostProcessor.java:167)
	... 41 more
Caused by: org.springframework.boot.context.properties.bind.validation.BindValidationException
	at org.springframework.boot.context.properties.bind.validation.ValidationBindHandler.throwBindValidationException(ValidationBindHandler.java:128)
	at org.springframework.boot.context.properties.bind.validation.ValidationBindHandler.validate(ValidationBindHandler.java:116)
	at org.springframework.boot.context.properties.bind.validation.ValidationBindHandler.validate(ValidationBindHandler.java:97)
	at org.springframework.boot.context.properties.bind.validation.ValidationBindHandler.onFinish(ValidationBindHandler.java:88)
	at org.springframework.boot.context.properties.bind.Binder.handleBindResult(Binder.java:213)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:200)
	... 45 more
```

When build with 1.2.10 no error occurs

When removing validation no exception occurs but properties are not injected.

See bugs: 
* https://youtrack.jetbrains.com/issue/KT-22380
* https://youtrack.jetbrains.com/issue/KT-21581

Workaround: add ``<kotlin.compiler.incremental>false</kotlin.compiler.incremental>`` to properties in pom.xml