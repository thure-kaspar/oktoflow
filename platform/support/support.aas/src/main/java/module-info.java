module de.iip_ecosphere.platform.support.aas {
    requires transitive java.net.http;
    requires transitive java.xml;
    requires transitive de.iip_ecosphere.platform.support;
    requires transitive de.iip_ecosphere.platform.support.boot; 

    exports de.iip_ecosphere.platform.support.aas; 
    exports de.iip_ecosphere.platform.support.aas.aas;
    exports de.iip_ecosphere.platform.support.aas.types.carbonFootprint;
    exports de.iip_ecosphere.platform.support.aas.types.common;
    exports de.iip_ecosphere.platform.support.aas.types.contactInformations;
    exports de.iip_ecosphere.platform.support.aas.types.documentation;
    exports de.iip_ecosphere.platform.support.aas.types.hierarchicalStructure;
    exports de.iip_ecosphere.platform.support.aas.types.softwareNameplate;
    exports de.iip_ecosphere.platform.support.aas.types.technicaldata;
    exports de.iip_ecosphere.platform.support.aas.types.timeSeriesData;
    exports de.iip_ecosphere.platform.support.identities;
    exports de.iip_ecosphere.platform.support.aas.metrics;
    exports de.iip_ecosphere.platform.support.net;
    exports de.iip_ecosphere.platform.support.semanticId;
}
