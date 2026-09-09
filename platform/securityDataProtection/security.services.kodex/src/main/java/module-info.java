module de.iip_ecosphere.platform.security.services.kodex {
    requires transitive de.iip_ecosphere.platform.services.environment;
    requires transitive de.iip_ecosphere.platform.transport;

    exports de.iip_ecosphere.platform.security.services.kodex;

    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.security.services.kodex.MultiKodexRestServicePluginDescriptor,
        de.iip_ecosphere.platform.security.services.kodex.KodexServicePluginDescriptor,
        de.iip_ecosphere.platform.security.services.kodex.KodexRestServicePluginDescriptor;

}
