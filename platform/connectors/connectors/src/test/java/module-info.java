open module de.iip_ecosphere.platform.connectors.tests {
	requires de.iip_ecosphere.platform.connectors;
	requires de.iip_ecosphere.platform.support.aas.tests;
	requires de.iip_ecosphere.platform.transport.tests;
	
	exports test.de.iip_ecosphere.platform.connectors;
	
	provides de.iip_ecosphere.platform.connectors.ConnectorDescriptor with test.de.iip_ecosphere.platform.connectors.MyChannelConnector.Descriptor, test.de.iip_ecosphere.platform.connectors.MyModelConnector.Descriptor, test.de.iip_ecosphere.platform.connectors.ConnectorsAasTest.Connector1Descriptor, test.de.iip_ecosphere.platform.connectors.ConnectorsAasTest.Connector2Descriptor;
	provides de.iip_ecosphere.platform.connectors.ConnectorExtensionDescriptor with test.de.iip_ecosphere.platform.connectors.ConnectorExtensionDescriptorTest.MyConnectorExtension;
}