module de.iip_ecosphere.platform.kiServices.rapidminer.rtsa {
    requires de.iip_ecosphere.platform.support;
    requires de.iip_ecosphere.platform.support.aas;

    requires transitive de.iip_ecosphere.platform.services.environment;
    requires transitive de.iip_ecosphere.platform.transport;

    exports de.iip_ecosphere.platform.kiServices.rapidminer.rtsa;

    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.kiServices.rapidminer.rtsa.MultiRtsaRestServicePluginDescriptor,
        de.iip_ecosphere.platform.kiServices.rapidminer.rtsa.RtsaRestServicePluginDescriptor;

}
