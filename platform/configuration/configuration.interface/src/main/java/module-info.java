module de.iip_ecosphere.platform.configuration.cfg {
    requires de.iip_ecosphere.platform.transport;
	requires de.iip_ecosphere.platform.support.aas; 

    requires transitive de.iip_ecosphere.platform.deviceMgt;
    requires transitive de.iip_ecosphere.platform.support.boot;

    exports de.iip_ecosphere.platform.configuration.cfg;

}
