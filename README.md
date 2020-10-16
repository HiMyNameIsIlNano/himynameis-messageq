# RabbitMQ Async Communication (a.k.a himynameis-messageq)

This project allows one to start and communicate with a RabbitMQ instance. This project allows one to:

- Build and start a RabbitMQ docker instance
- Build a `jar` file with the gRPC apis suitable for a `java` client that wants to interact with the queue
- Publish the above mentioned `jar` onto a JFROG-Artifactory server
- Build a `dll` file with the gRPC .net Core apis suitable for a `net47` client that wants to interact with the queue

Every client that wants to interact with the RabbitMQ instance can simply import and start using the APIs defined in the protobuf `schema` folder.

How to add the library as a dependency in `gradle`:

```implementation(group: 'com.example', name: 'messageq-grpc-api-schema', version: '0.0.1-SNAPSHOT')```

# Publish the Java APIs to Artifactory

In order to publish a new version of the APIs `jar` a few parameters need to be adjusted in the `gradle.properties` files. The following is the list with the parameters relevant to the publication:  

- artifactoryUser
- artifactoryPassword
- artifactoryUrl
- artifactorySnapshotLocalUrl
- artifactoryReleaseLocalUrl

Once the correct parameters are set, the publication can be performed with the following command: 

```./gradlew clean artifactoryPublish```

# Publish the .Net APIs to Artifactory 

This is still a work in progress. The `oss` version of JFROG-Artifactory does not seem to be able to support `nuget` packages out of the box. In order to check and see how to generate and publish a nuget package locally please [check here](./messageq-grpc-csharp/MessageqGrpcCsharpLib/MessageqGrpcCsharp/README.md).

# TODOs:
- [ ] Publish the above mentioned `dll` library file onto a local artifactory  