# RabbitMQ Async Communication (a.k.a himynameis-messageq)

This project allows one to start and communicate with a RabbitMQ instance. This project allows one to:

- Build and start a RabbitMQ docker instance
- Build a `jar` file with the gRPC apis available for a client to interact with the queue
- Publish the above mentioned library file (jar) onto a local artifactory
- Build a `dll` file with the gRPC .net Core apis available for a client to interact with the queue

Every client that wants to interact with the RabbitMQ instance can simply import and start using the APIs defined in the protobuf `schema` folder.

# Publish the Java APIs to Artifactory

In order to publish a new version of the APIs `jar` a few parameters need to be adjusted in the `gradle.properties` files. The following is the list with the parameters relevant to the publication:  

- artifactoryUser
- artifactoryPassword
- artifactoryUrl
- artifactorySnapshotLocalUrl
- artifactoryReleaseLocalUrl

Once the correct parameters are set, the publication can be performed with the following command: 

```./gradlew clean artifactoryPublish```

# TODOs:
- [ ] Publish the above mentioned `dll` library file onto a local artifactory  