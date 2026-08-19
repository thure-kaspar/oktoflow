open module de.iip_ecosphere.platform.support.iip_aas.tests {
	requires de.iip_ecosphere.platform.support.iip_aas;
	requires de.iip_ecosphere.platform.support.aas;
	requires de.iip_ecosphere.platform.support.aas.tests;
	
	provides de.iip_ecosphere.platform.support.iip_aas.AasContributor with test.de.iip_ecosphere.platform.support.iip_aas.AasPartRegistryTest.Contributor1, test.de.iip_ecosphere.platform.support.iip_aas.AasPartRegistryTest.Contributor2;
}