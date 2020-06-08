# Spring Cloud Microservices Demo
A demonstration that uses 8 separate microservices following a course by Richard Seroter:
<ul>
  <li>SpringCloudTaskConcatenator: A Spring Cloud Task to concatenate the input.</li>
  <li>SpringCloudSecureServer: A server to request user credentials via GitHub.</li>
  <li>SpringCloudSecureUi: A secure microservice user interface.</li>
  <li>SpingCloudTaskIntakeDemo: Creates a link with a RabbitMQ service to process messages.</li>
  <li>SpringCloudSinkDemo: A sink used to listen for messages via HTTP request. Linked to RabbitMQ.</li>
  <li>SpringCloudServerDemo: A server microservice built with Spring Cloud.</li>
  <li>SpringCloudConfigDemo: Dynamic configuration server.</li>
  <li>SpringCloudClientDemo: Client demo built with Spring Cloud.</li>

</ul>

# Motivation
The demonstration has been built following a tutorial and introduces Spring Cloud components and MQ services.

# Tech/Framework
<ul>
  <li>Java 8</li>
  <li>Spring Cloud</li>
  <li>RabbitMQ</li>
</ul>

# Features
<ul>
  <li>User configuration with GitHub</li>
  <li>RabbitMQ messaging</li>
</ul>
