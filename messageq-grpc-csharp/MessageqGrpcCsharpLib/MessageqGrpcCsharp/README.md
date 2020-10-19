# How to build the nupkg for this project

Due to the way `Grpc.Core` and the `nuget/dotnet SDK` work together (see here [gRPC Stack Overflow thread](https://stackoverflow.com/questions/41941588/binaries-are-added-to-project-when-nuget-package-has-grpc-core-as-a-dependency) and here [gRPC Github issue](https://github.com/grpc/grpc/issues/11279)) the only way I managed to get this package to build and being imported correctly into another project is with the following command:

```nuget pack MessageqGrpcCsharp.csproj -Exclude "**\*.x86.*;**\*.x64.*"```

So, the whole sequence of actions to get this project to be exported as a `nuget` package is:

- build the project `dll` (either from the IDE or the command line e.g. `dotnet build`)
- run `nuget pack MessageqGrpcCsharp.csproj -Exclude "**\*.x86.*;**\*.x64.*"`

# TODOs:
- [ ] Try to get the package to build without using the exclude parameters from the command line 