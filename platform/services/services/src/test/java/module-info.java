open module de.iip_ecosphere.platform.services.tests {
	requires de.iip_ecosphere.platform.services;
	requires de.iip_ecosphere.platform.transport.tests;
	
	provides de.iip_ecosphere.platform.services.ServiceFactoryDescriptor with test.de.iip_ecosphere.platform.services.MyServiceFactoryDescriptor;
}