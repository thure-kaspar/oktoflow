module de.iip_ecosphere.platform.services {
    requires transitive de.iip_ecosphere.platform.services.environment;
    requires transitive de.iip_ecosphere.platform.support;
    requires transitive de.iip_ecosphere.platform.support.aas;
    requires transitive de.iip_ecosphere.platform.support.boot;
    requires transitive de.iip_ecosphere.platform.support.iip_aas;
    requires transitive de.iip_ecosphere.platform.transport;

    exports de.iip_ecosphere.platform.services;

    provides de.iip_ecosphere.platform.support.aas.LifecycleDescriptor with
        de.iip_ecosphere.platform.services.ServicesLifecycleDescriptor;
    provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with
        de.iip_ecosphere.platform.services.ServicesAas;

}
