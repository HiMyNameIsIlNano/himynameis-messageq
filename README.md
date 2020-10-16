# RabbitMQ Async Communication (a.k.a himynameis-messageq)

This project allows one to start and communicate with a RabbitMQ instance. This project allows one to:

- Build and start a RabbitMQ docker instance
- Build a `jar` file with the gRPC apis available for a client to interact with the queue
- Publish the above mentioned library file (jar) onto a local artifactory
- Build a `dll` file with the gRPC .net Core apis available for a client to interact with the queue

Every client that wants to interact with the RabbitMQ instance can simply import and start using the APIs defined in the protobuf `schema` folder.

# TODOs:
- [ ] Publish the above mentioned `dll` library file onto a local artifactory  