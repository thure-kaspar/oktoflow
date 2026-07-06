/********************************************************************************
 * Copyright (c) {2020} The original author or authors
 *
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 which is available 
 * at http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: Apache-2.0 OR EPL-2.0
 ********************************************************************************/
package test.de.iip_ecosphere.platform.support.aas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.de.iip_ecosphere.platform.support.SchemaServerEndpointTest;
import test.de.iip_ecosphere.platform.support.aas.aas.AbstractAasExampleTest;
import test.de.iip_ecosphere.platform.support.aas.aas.ContactInformationsTest;
import test.de.iip_ecosphere.platform.support.aas.aas.IdentifierTypeTest;
import test.de.iip_ecosphere.platform.support.aas.aas.LangStringTest;
import test.de.iip_ecosphere.platform.support.aas.aas.LocalInvocationTest;
import test.de.iip_ecosphere.platform.support.aas.aas.PCF;
import test.de.iip_ecosphere.platform.support.aas.aas.SemanticIdRecognizerTest;
import test.de.iip_ecosphere.platform.support.aas.aas.SoftwareNameplateTest;
import test.de.iip_ecosphere.platform.support.aas.aas.TechnicalDataSubmodelTest;
import test.de.iip_ecosphere.platform.support.aas.aas.TimeSeriesDataTest;
import test.de.iip_ecosphere.platform.support.aas.aas.UtilsTest;
import test.de.iip_ecosphere.platform.support.aas.aas.XmasAas;
import test.de.iip_ecosphere.platform.support.aas.metrics.MetricsTests;
import test.de.iip_ecosphere.platform.support.aas.IOVoidFunctionTest;
import test.de.iip_ecosphere.platform.support.NetUtilsTest;
import test.de.iip_ecosphere.platform.support.fakeAas.FactoryTest;
import test.de.iip_ecosphere.platform.support.fakeAas.PrintVisitorTest;
import test.de.iip_ecosphere.platform.support.net.KeyStoreDescriptorTest;
import test.de.iip_ecosphere.platform.support.net.NetworkManagerTest;
import test.de.iip_ecosphere.platform.support.net.SslUtilsTest;
import test.de.iip_ecosphere.platform.support.net.UriResolverTest;

/**
 * Defines the tests to be executed.
 * 
 * @author Holger Eichelberger, SSE
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    NetUtilsTest.class,
    SchemaServerEndpointTest.class,
    FactoryTest.class, // we do not go for a sub-suite for now as Maven may execute both
    PrintVisitorTest.class,
    NetworkManagerTest.class,
    UriResolverTest.class,
    SslUtilsTest.class,
    KeyStoreDescriptorTest.class,
    LifecycleHandlerTest.class, 
    LocalInvocationTest.class, 
    SystemMetricsTest.class,
    IOVoidFunctionTest.class,
    SemanticIdResolverTest.class,
    IdentifierTypeTest.class,
    SemanticIdRecognizerTest.class,
    
    MetricsTests.class,
    test.de.iip_ecosphere.platform.support.identities.AllTests.class,
    TechnicalDataSubmodelTest.class,
    AbstractAasExampleTest.class,
    UtilsTest.class,
    
    // non-generic AAS 
    LangStringTest.class,
    XmasAas.class,
    TimeSeriesDataTest.class,
    PCF.class,
    ContactInformationsTest.class,
    SoftwareNameplateTest.class
})
public class AllTests {
}
