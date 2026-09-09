open module de.iip_ecosphere.platform.deviceMgt.tests {
	requires de.iip_ecosphere.platform.deviceMgt;
	requires de.iip_ecosphere.platform.support.aas;
	requires de.iip_ecosphere.platform.support.boot;
	requires de.iip_ecosphere.platform.support.aas.tests;
	
	provides de.iip_ecosphere.platform.deviceMgt.DeviceFirmwareOperations with test.de.iip_ecosphere.platform.deviceMgt.StubDeviceManagement;
	provides de.iip_ecosphere.platform.deviceMgt.DeviceRemoteManagementOperations with test.de.iip_ecosphere.platform.deviceMgt.StubDeviceManagement;
	provides de.iip_ecosphere.platform.deviceMgt.DeviceResourceConfigOperations with test.de.iip_ecosphere.platform.deviceMgt.StubDeviceManagement;
	provides de.iip_ecosphere.platform.deviceMgt.registry.DeviceRegistryFactoryDescriptor with test.de.iip_ecosphere.platform.deviceMgt.registry.StubDeviceRegistryFactoryDescriptor;
	provides de.iip_ecosphere.platform.deviceMgt.storage.StorageFactoryDescriptor with test.de.iip_ecosphere.platform.deviceMgt.storage.StubStorageFactoryDescriptor;
	provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with test.de.iip_ecosphere.platform.deviceMgt.StubEcsAas;
}