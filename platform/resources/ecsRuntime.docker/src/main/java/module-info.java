module de.iip_ecosphere.platform.ecsRuntime.docker {
    requires docker.java.core;
    requires docker.java.transport;
    requires docker.java.transport.httpclient5;
    requires de.iip_ecosphere.platform.support.iip_aas;
	requires de.iip_ecosphere.platform.support.aas;

    requires transitive docker.java.api;
    requires transitive de.iip_ecosphere.platform.ecsRuntime;
    requires transitive de.iip_ecosphere.platform.support;

    exports de.iip_ecosphere.platform.ecsRuntime.docker;

    provides de.iip_ecosphere.platform.ecsRuntime.EcsFactoryDescriptor with
        de.iip_ecosphere.platform.ecsRuntime.docker.DockerContainerManager.FactoryDescriptor;
    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.ecsRuntime.docker.DockerContainerPluginDescriptor;

}
