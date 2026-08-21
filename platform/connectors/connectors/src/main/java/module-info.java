module de.iip_ecosphere.platform.connectors {

    requires transitive de.iip_ecosphere.platform.support.aas;
    requires transitive de.iip_ecosphere.platform.support.iip_aas;
    requires transitive de.iip_ecosphere.platform.transport;

    exports de.iip_ecosphere.platform.connectors;
    exports de.iip_ecosphere.platform.connectors.events;
    exports de.iip_ecosphere.platform.connectors.formatter;
    exports de.iip_ecosphere.platform.connectors.model;
    exports de.iip_ecosphere.platform.connectors.parser;
    exports de.iip_ecosphere.platform.connectors.types;

    provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with
        de.iip_ecosphere.platform.connectors.ConnectorsAas;

}
