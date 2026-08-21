open module de.iip_ecosphere.platform.transport.tests {
	requires de.iip_ecosphere.platform.transport;
	requires de.iip_ecosphere.platform.support.aas;
	requires de.iip_ecosphere.platform.support.aas.tests;
	requires test.mqtt.hivemq;
	requires test.mqtt.moquette;
	requires org.eclipse.paho.client.mqttv3;
	
	exports test.de.iip_ecosphere.platform.transport;
	
	provides de.iip_ecosphere.platform.transport.status.TraceRecordFilter with test.de.iip_ecosphere.platform.transport.TraceRecordTestFilter;
	provides de.iip_ecosphere.platform.transport.TransportFactoryDescriptor with test.de.iip_ecosphere.platform.transport.DirectMemoryTransportConnectorTest.TestFactoryDescriptor;
}