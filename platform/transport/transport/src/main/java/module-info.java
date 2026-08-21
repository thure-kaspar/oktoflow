module de.iip_ecosphere.platform.transport {
    requires transitive de.iip_ecosphere.platform.support.boot;
    requires transitive de.iip_ecosphere.platform.support.iip_aas;
	requires de.iip_ecosphere.platform.support.aas;

    exports de.iip_ecosphere.platform.transport;
    exports de.iip_ecosphere.platform.transport.connectors;
    exports de.iip_ecosphere.platform.transport.connectors.basics;
    exports de.iip_ecosphere.platform.transport.connectors.impl;
    exports de.iip_ecosphere.platform.transport.serialization;
    exports de.iip_ecosphere.platform.transport.status;
    exports de.iip_ecosphere.platform.transport.streams;
    
    opens de.iip_ecosphere.platform.transport.status;

    provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with
        de.iip_ecosphere.platform.transport.TransportAas;

}
