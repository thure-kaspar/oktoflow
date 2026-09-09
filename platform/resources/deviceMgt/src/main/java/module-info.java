module de.iip_ecosphere.platform.deviceMgt {
    requires de.iip_ecosphere.platform.support.boot;
	requires de.iip_ecosphere.platform.support.aas;

    requires transitive de.iip_ecosphere.platform.support.iip_aas;

    exports de.iip_ecosphere.platform.deviceMgt;
    exports de.iip_ecosphere.platform.deviceMgt.ecs;
    exports de.iip_ecosphere.platform.deviceMgt.registry;
    exports de.iip_ecosphere.platform.deviceMgt.ssh;
    exports de.iip_ecosphere.platform.deviceMgt.storage;

    provides de.iip_ecosphere.platform.deviceMgt.registry.DeviceRegistryClient with
        de.iip_ecosphere.platform.deviceMgt.registry.DeviceRegistryAasClient;
    provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with
        de.iip_ecosphere.platform.deviceMgt.DeviceManagementAas,
        de.iip_ecosphere.platform.deviceMgt.registry.DeviceRegistryAas;

}
