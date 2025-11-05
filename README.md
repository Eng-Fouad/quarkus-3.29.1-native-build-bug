- Run with:

```shell script
./gradlew testNative
```

- Output:

```
quarkus.native.container-runtime config property must be set to either podman or docker and the executable must be available. Ignoring it.
> Task :quarkusAppPartsBuild FAILED
FAILURE: Build failed with an exception.
* What went wrong:
Execution failed for task ':quarkusAppPartsBuild'.
> There was a failure while executing work items
   > A failure occurred while executing io.quarkus.gradle.tasks.worker.BuildWorker
      > io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        	[error]: Build step io.quarkus.deployment.pkg.steps.NativeImageBuildStep#resolveNativeImageBuildRunner threw an exception: java.lang.IllegalStateException: No container CLI was found. Make sure you have either Docker or Podman CLI installed in your environment.
        	at io.quarkus.deployment.util.ContainerRuntimeUtil.detectContainerRuntime(ContainerRuntimeUtil.java:79)
        	at io.quarkus.deployment.util.ContainerRuntimeUtil.detectContainerRuntime(ContainerRuntimeUtil.java:64)
        	at io.quarkus.deployment.util.ContainerRuntimeUtil.detectContainerRuntime(ContainerRuntimeUtil.java:51)
        	at io.quarkus.deployment.util.ContainerRuntimeUtil.detectContainerRuntime(ContainerRuntimeUtil.java:43)
        	at io.quarkus.deployment.pkg.steps.NativeImageBuildContainerRunner.<init>(NativeImageBuildContainerRunner.java:30)
        	at io.quarkus.deployment.pkg.steps.NativeImageBuildLocalContainerRunner.<init>(NativeImageBuildLocalContainerRunner.java:20)
        	at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.resolveNativeImageBuildRunner(NativeImageBuildStep.java:371)
        	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:735)
        	at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:872)
        	at io.quarkus.builder.BuildContext.run(BuildContext.java:255)
        	at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
        	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
        	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1694)
        	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
        	at java.base/java.lang.Thread.run(Thread.java:1474)
        	at org.jboss.threads.JBossThread.run(JBossThread.java:501)
```