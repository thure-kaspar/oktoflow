module de.iip_ecosphere.platform.support.dfltSysMetrics {
	requires de.iip_ecosphere.platform.support.aas;
	requires jcuda;
	
    exports de.iip_ecosphere.platform.support.dfltSysMetrics;

    provides de.iip_ecosphere.platform.support.aas.metrics.SystemMetricsDescriptor with
        de.iip_ecosphere.platform.support.dfltSysMetrics.DefaultSystemMetricsDescriptor;
    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.support.dfltSysMetrics.DefaultSystemMetricsDescriptor;

}
