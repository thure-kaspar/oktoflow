open module de.iip_ecosphere.platform.support.aas.tests {
	requires de.iip_ecosphere.platform.support.aas;
	requires jdk.httpserver;
    
    provides de.iip_ecosphere.platform.support.aas.aas.AasFactoryDescriptor with test.de.iip_ecosphere.platform.support.fakeAas.FakeAasFactory.Descriptor;
    provides de.iip_ecosphere.platform.support.aas.aas.ProtocolDescriptor with test.de.iip_ecosphere.platform.support.fakeAas.FakeProtocolDescriptor;
    provides de.iip_ecosphere.platform.support.aas.LifecycleDescriptor with test.de.iip_ecosphere.platform.support.aas.LifecycleHandlerTest.LcDesc1, test.de.iip_ecosphere.platform.support.aas.LifecycleHandlerTest.LcDesc2;
    provides de.iip_ecosphere.platform.support.semanticId.SemanticIdResolverDescriptor with test.de.iip_ecosphere.platform.support.aas.SemanticIdResolverTest.MyResolverDescriptor;
}