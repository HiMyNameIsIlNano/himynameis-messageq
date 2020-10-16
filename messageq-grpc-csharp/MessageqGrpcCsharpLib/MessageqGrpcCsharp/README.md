# How to build the nupkg for this project

Due to a strange way Grpc.Core and nuget/dotnet SDK work together (see here [gRPC Stack Overflow thread](https://stackoverflow.com/questions/41941588/binaries-are-added-to-project-when-nuget-package-has-grpc-core-as-a-dependency) and here [gRPC Github issue](https://github.com/grpc/grpc/issues/11279)) the only way I managed to get this package to build and being used the way I wanted was through the following command:

```%> nuget pack MessageqGrpcCsharp.csproj -Exclude "**\*.x86.*;**\*.x64.*"```

The whole sequence of actions should be:

- build the project `dll` (either from the IDE or the command line)
- run `nuget pack MessageqGrpcCsharp.csproj -Exclude "**\*.x86.*;**\*.x64.*"`

# TODOs:
- [ ] Try to get the package to build without using the exclude parameters from the command line 