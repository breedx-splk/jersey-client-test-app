Test app for trying otel java agent along with jersey client.

# server

There's a test server to run:

```
$ cd server
$ ./run.sh

```

# running

To run this test app, pass the following JVM args:
```
-javaagent:./splunk-otel-javaagent-all.jar
-Dotel.javaagent.debug=true
-Dotel.exporter=logging
-Dio.opentelemetry.javaagent.slf4j.simpleLogger.defaultLogLevel=debug
-Dotel.resource.attributes=service.name=jersey-test-app
```