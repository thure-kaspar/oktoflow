module de.iip_ecosphere.platform.deviceMgt.minio {
    requires transitive de.iip_ecosphere.platform.deviceMgt;
	requires minio;
	requires de.iip_ecosphere.platform.support.aas;

    exports de.iip_ecosphere.platform.deviceMgt.minio;

    provides de.iip_ecosphere.platform.deviceMgt.storage.StorageFactoryDescriptor with
        de.iip_ecosphere.platform.deviceMgt.minio.S3StorageFactoryDescriptor;
    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.deviceMgt.minio.S3StorageFactoryDescriptor;

}
