module de.iip_ecosphere.platform.configuration {
    requires de.iip_ecosphere.platform.configuration.cfg;
    requires de.iip_ecosphere.platform.support.aas;

    requires transitive de.iip_ecosphere.platform.deviceMgt;
    requires transitive de.iip_ecosphere.platform.support;
    requires transitive de.iip_ecosphere.platform.support.iip_aas;

    exports de.iip_ecosphere.platform.configuration;

    provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with
        de.iip_ecosphere.platform.configuration.ConfigurationAas;

}
