module de.iip_ecosphere.platform.connectors.modbustcpipv1 {
    requires transitive de.iip_ecosphere.platform.connectors;
	requires j2mod;

    exports de.iip_ecosphere.platform.connectors.modbustcpipv1;

    provides de.iip_ecosphere.platform.connectors.ConnectorDescriptor with
        de.iip_ecosphere.platform.connectors.modbustcpipv1.ModbusTcpIpConnector.Descriptor;
    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.connectors.modbustcpipv1.ModbusTcpIpConnector.Descriptor;

}
