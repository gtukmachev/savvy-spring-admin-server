![](./images/logo-spring-boot-admin.png)
===============================

The tool provides a web UI for monitoring and management of launched applications based on the [Spring Boot <sup>®</sup>](http://projects.spring.io/spring-boot/ "Official Spring-Boot website") 
framework.

##### Savvy applications under the monitoring:
* Presentation API
* Admin Tool
* Credit Service _(is not connected yet)_
* Offers Engine _(is not connected yet)_

 


### Features
It provides the following features for registered application.

* Show health status
* Show details, like
  * JVM & memory metrics
  * micrometer.io metrics
  * Datasource metrics
  * Cache metrics
* Show build-info number
* Follow and download logfile
* View jvm system- & environment-properties
* Support for Spring Cloud's postable /env- &/refresh-endpoint
* Easy loglevel management
* Interact with JMX-beans
* View thread dump
* View http-traces
* View auditevents
* View Http-Endpoints
* View Scheduled Tasks
* View and delete active sessions (using spring-session)
* View Flyway / Liquibase database migrations
* Download heapdump
* Notification on status change (via e-mail, Slack, Hipchat, ...)
* Event journal of status changes (non persistent)