package de.iip_ecosphere.platform.support.aas.basyx;

import de.iip_ecosphere.platform.support.aas.aas.AasServer;
import de.iip_ecosphere.platform.support.aas.aas.SetupSpec;
import de.iip_ecosphere.platform.support.aas.aas.SetupSpec.AasComponent;
import de.iip_ecosphere.platform.support.boot.Server;

/**
 * A simple, immediate AAS server implementation.
 * 
 * @author Holger Eichelberger, SSE
 */
class BaSyxImmediateDeploymentAasServer extends BaSyxAbstractAasServer {

    private Server server;
    
    /**
     * Creates a new BaSyx AAS server.
     * 
     * @param dSpec the deployment specification
     * @param sSpec the setup specification
     * @param component the specific component to create the server for
     */
    BaSyxImmediateDeploymentAasServer(DeploymentSpec dSpec, SetupSpec sSpec, AasComponent component) {
        super(dSpec);
        server = VersionAdjustment.createBaSyxServer(dSpec, sSpec, component);
    }
    
    @Override
    public AasServer start() {
        server.start();
        return this;
    }

    @Override
    public void stop(boolean dispose) {
        server.stop(dispose);
        super.stop(dispose); // if not disposable, schedule for deletion at JVM end
    }

}