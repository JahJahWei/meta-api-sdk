package com.meta.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class MetaServiceGrpc {

  private MetaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "meta.v1.MetaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.meta.v1.GetUserRequest,
      com.meta.v1.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.meta.v1.GetUserRequest.class,
      responseType = com.meta.v1.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.meta.v1.GetUserRequest,
      com.meta.v1.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.meta.v1.GetUserRequest, com.meta.v1.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = MetaServiceGrpc.getGetUserMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getGetUserMethod = MetaServiceGrpc.getGetUserMethod) == null) {
          MetaServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.meta.v1.GetUserRequest, com.meta.v1.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.meta.v1.GetBedsRequest,
      com.meta.v1.GetBedsResponse> getGetBedsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBeds",
      requestType = com.meta.v1.GetBedsRequest.class,
      responseType = com.meta.v1.GetBedsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.meta.v1.GetBedsRequest,
      com.meta.v1.GetBedsResponse> getGetBedsMethod() {
    io.grpc.MethodDescriptor<com.meta.v1.GetBedsRequest, com.meta.v1.GetBedsResponse> getGetBedsMethod;
    if ((getGetBedsMethod = MetaServiceGrpc.getGetBedsMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getGetBedsMethod = MetaServiceGrpc.getGetBedsMethod) == null) {
          MetaServiceGrpc.getGetBedsMethod = getGetBedsMethod =
              io.grpc.MethodDescriptor.<com.meta.v1.GetBedsRequest, com.meta.v1.GetBedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetBedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetBedsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("GetBeds"))
              .build();
        }
      }
    }
    return getGetBedsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.meta.v1.GetAlertsRequest,
      com.meta.v1.GetAlertsResponse> getGetAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlerts",
      requestType = com.meta.v1.GetAlertsRequest.class,
      responseType = com.meta.v1.GetAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.meta.v1.GetAlertsRequest,
      com.meta.v1.GetAlertsResponse> getGetAlertsMethod() {
    io.grpc.MethodDescriptor<com.meta.v1.GetAlertsRequest, com.meta.v1.GetAlertsResponse> getGetAlertsMethod;
    if ((getGetAlertsMethod = MetaServiceGrpc.getGetAlertsMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getGetAlertsMethod = MetaServiceGrpc.getGetAlertsMethod) == null) {
          MetaServiceGrpc.getGetAlertsMethod = getGetAlertsMethod =
              io.grpc.MethodDescriptor.<com.meta.v1.GetAlertsRequest, com.meta.v1.GetAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetAlertsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("GetAlerts"))
              .build();
        }
      }
    }
    return getGetAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.meta.v1.GetInfusionDevicesRequest,
      com.meta.v1.GetInfusionDevicesResponse> getGetInfusionDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfusionDevices",
      requestType = com.meta.v1.GetInfusionDevicesRequest.class,
      responseType = com.meta.v1.GetInfusionDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.meta.v1.GetInfusionDevicesRequest,
      com.meta.v1.GetInfusionDevicesResponse> getGetInfusionDevicesMethod() {
    io.grpc.MethodDescriptor<com.meta.v1.GetInfusionDevicesRequest, com.meta.v1.GetInfusionDevicesResponse> getGetInfusionDevicesMethod;
    if ((getGetInfusionDevicesMethod = MetaServiceGrpc.getGetInfusionDevicesMethod) == null) {
      synchronized (MetaServiceGrpc.class) {
        if ((getGetInfusionDevicesMethod = MetaServiceGrpc.getGetInfusionDevicesMethod) == null) {
          MetaServiceGrpc.getGetInfusionDevicesMethod = getGetInfusionDevicesMethod =
              io.grpc.MethodDescriptor.<com.meta.v1.GetInfusionDevicesRequest, com.meta.v1.GetInfusionDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInfusionDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetInfusionDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meta.v1.GetInfusionDevicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetaServiceMethodDescriptorSupplier("GetInfusionDevices"))
              .build();
        }
      }
    }
    return getGetInfusionDevicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceStub>() {
        @java.lang.Override
        public MetaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceStub(channel, callOptions);
        }
      };
    return MetaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MetaServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingV2Stub>() {
        @java.lang.Override
        public MetaServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return MetaServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceBlockingStub>() {
        @java.lang.Override
        public MetaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceBlockingStub(channel, callOptions);
        }
      };
    return MetaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaServiceFutureStub>() {
        @java.lang.Override
        public MetaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaServiceFutureStub(channel, callOptions);
        }
      };
    return MetaServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 用户
     * </pre>
     */
    default void getUser(com.meta.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 病区一览
     * </pre>
     */
    default void getBeds(com.meta.v1.GetBedsRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetBedsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBedsMethod(), responseObserver);
    }

    /**
     */
    default void getAlerts(com.meta.v1.GetAlertsRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetAlertsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 输液管理
     * </pre>
     */
    default void getInfusionDevices(com.meta.v1.GetInfusionDevicesRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetInfusionDevicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInfusionDevicesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MetaService.
   */
  public static abstract class MetaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MetaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MetaService.
   */
  public static final class MetaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MetaServiceStub> {
    private MetaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用户
     * </pre>
     */
    public void getUser(com.meta.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 病区一览
     * </pre>
     */
    public void getBeds(com.meta.v1.GetBedsRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetBedsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBedsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlerts(com.meta.v1.GetAlertsRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetAlertsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 输液管理
     * </pre>
     */
    public void getInfusionDevices(com.meta.v1.GetInfusionDevicesRequest request,
        io.grpc.stub.StreamObserver<com.meta.v1.GetInfusionDevicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInfusionDevicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MetaService.
   */
  public static final class MetaServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MetaServiceBlockingV2Stub> {
    private MetaServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 用户
     * </pre>
     */
    public com.meta.v1.GetUserResponse getUser(com.meta.v1.GetUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 病区一览
     * </pre>
     */
    public com.meta.v1.GetBedsResponse getBeds(com.meta.v1.GetBedsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetBedsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.meta.v1.GetAlertsResponse getAlerts(com.meta.v1.GetAlertsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAlertsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 输液管理
     * </pre>
     */
    public com.meta.v1.GetInfusionDevicesResponse getInfusionDevices(com.meta.v1.GetInfusionDevicesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetInfusionDevicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service MetaService.
   */
  public static final class MetaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MetaServiceBlockingStub> {
    private MetaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用户
     * </pre>
     */
    public com.meta.v1.GetUserResponse getUser(com.meta.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 病区一览
     * </pre>
     */
    public com.meta.v1.GetBedsResponse getBeds(com.meta.v1.GetBedsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBedsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.meta.v1.GetAlertsResponse getAlerts(com.meta.v1.GetAlertsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAlertsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 输液管理
     * </pre>
     */
    public com.meta.v1.GetInfusionDevicesResponse getInfusionDevices(com.meta.v1.GetInfusionDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInfusionDevicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MetaService.
   */
  public static final class MetaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MetaServiceFutureStub> {
    private MetaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.meta.v1.GetUserResponse> getUser(
        com.meta.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 病区一览
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.meta.v1.GetBedsResponse> getBeds(
        com.meta.v1.GetBedsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBedsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.meta.v1.GetAlertsResponse> getAlerts(
        com.meta.v1.GetAlertsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAlertsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 输液管理
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.meta.v1.GetInfusionDevicesResponse> getInfusionDevices(
        com.meta.v1.GetInfusionDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInfusionDevicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_GET_BEDS = 1;
  private static final int METHODID_GET_ALERTS = 2;
  private static final int METHODID_GET_INFUSION_DEVICES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((com.meta.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.meta.v1.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_BEDS:
          serviceImpl.getBeds((com.meta.v1.GetBedsRequest) request,
              (io.grpc.stub.StreamObserver<com.meta.v1.GetBedsResponse>) responseObserver);
          break;
        case METHODID_GET_ALERTS:
          serviceImpl.getAlerts((com.meta.v1.GetAlertsRequest) request,
              (io.grpc.stub.StreamObserver<com.meta.v1.GetAlertsResponse>) responseObserver);
          break;
        case METHODID_GET_INFUSION_DEVICES:
          serviceImpl.getInfusionDevices((com.meta.v1.GetInfusionDevicesRequest) request,
              (io.grpc.stub.StreamObserver<com.meta.v1.GetInfusionDevicesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.meta.v1.GetUserRequest,
              com.meta.v1.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getGetBedsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.meta.v1.GetBedsRequest,
              com.meta.v1.GetBedsResponse>(
                service, METHODID_GET_BEDS)))
        .addMethod(
          getGetAlertsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.meta.v1.GetAlertsRequest,
              com.meta.v1.GetAlertsResponse>(
                service, METHODID_GET_ALERTS)))
        .addMethod(
          getGetInfusionDevicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.meta.v1.GetInfusionDevicesRequest,
              com.meta.v1.GetInfusionDevicesResponse>(
                service, METHODID_GET_INFUSION_DEVICES)))
        .build();
  }

  private static abstract class MetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.meta.v1.MetaProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetaService");
    }
  }

  private static final class MetaServiceFileDescriptorSupplier
      extends MetaServiceBaseDescriptorSupplier {
    MetaServiceFileDescriptorSupplier() {}
  }

  private static final class MetaServiceMethodDescriptorSupplier
      extends MetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MetaServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetaServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getGetBedsMethod())
              .addMethod(getGetAlertsMethod())
              .addMethod(getGetInfusionDevicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
