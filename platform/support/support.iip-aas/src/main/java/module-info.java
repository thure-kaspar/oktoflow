module de.iip_ecosphere.platform.support.iip_aas {
    requires java.management;
    requires de.iip_ecosphere.platform.support.aas; 

    exports de.iip_ecosphere.platform.support.iip_aas;
    exports de.iip_ecosphere.platform.support.iip_aas.config;
    
    opens de.iip_ecosphere.platform.support.iip_aas;

    provides de.iip_ecosphere.platform.support.boot.JavaBinaryPathDescriptor with
        de.iip_ecosphere.platform.support.iip_aas.RecentJavaBinaryPathDescriptor;
    provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with
        de.iip_ecosphere.platform.support.iip_aas.PlatformAas,
        de.iip_ecosphere.platform.support.iip_aas.NetworkManagerAas;
    provides de.iip_ecosphere.platform.support.semanticId.SemanticIdResolverDescriptor with
        de.iip_ecosphere.platform.support.iip_aas.EclassYamlSemanticIdResolverDescriptor,
        de.iip_ecosphere.platform.support.iip_aas.AdminShellYamlSemanticIdResolverDescriptor;

}
