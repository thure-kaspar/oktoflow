module de.iip_ecosphere.platform.platform {
    requires transitive de.iip_ecosphere.platform.deviceMgt;
    requires transitive de.iip_ecosphere.platform.ecsRuntime;
    requires transitive de.iip_ecosphere.platform.services;
    requires transitive de.iip_ecosphere.platform.services.environment;
    requires transitive de.iip_ecosphere.platform.support;
    requires transitive de.iip_ecosphere.platform.support.iip_aas;
    requires transitive de.iip_ecosphere.platform.transport;

    exports de.iip_ecosphere.platform.platform;
    exports de.iip_ecosphere.platform.platform.cli;

    provides de.iip_ecosphere.platform.support.aas.LifecycleDescriptor with
        de.iip_ecosphere.platform.platform.PlatformLifecycleDescriptor,
        de.iip_ecosphere.platform.platform.PlattformAasLifecycleDescriptor; 
    provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with
        de.iip_ecosphere.platform.platform.PlatformAas; 

}
