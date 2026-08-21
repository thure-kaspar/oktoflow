module de.iip_ecosphere.platform.connectors.ads {
    requires transitive de.iip_ecosphere.platform.connectors;
    requires transitive de.iip_ecosphere.platform.libs.ads;

    exports de.iip_ecosphere.platform.connectors.ads;

    provides de.iip_ecosphere.platform.connectors.ConnectorDescriptor with
        de.iip_ecosphere.platform.connectors.ads.AdsConnector.Descriptor;
    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.connectors.ads.AdsConnector.Descriptor;

}
