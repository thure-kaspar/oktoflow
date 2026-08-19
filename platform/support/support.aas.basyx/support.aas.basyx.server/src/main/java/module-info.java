module de.iip_ecosphere.platform.support.aas.basyx.server {
    requires transitive basyx.components.AASServer;
    requires transitive basyx.components.registry;
    requires transitive de.iip_ecosphere.platform.support.aas;
    requires transitive de.iip_ecosphere.platform.support.aas.basyx;

    exports de.iip_ecosphere.platform.support.aas.basyx.server;

    provides de.iip_ecosphere.platform.support.aas.aas.AasServerRecipeDescriptor with
        de.iip_ecosphere.platform.support.aas.basyx.server.BaSyxFullServerRecipe.BaSyxFullServerReceipeDescriptor;
    provides de.iip_ecosphere.platform.support.plugins.PluginDescriptor with
        de.iip_ecosphere.platform.support.aas.basyx.server.BaSyxFullServerRecipe.BaSyxFullServerReceipeDescriptor;

}
