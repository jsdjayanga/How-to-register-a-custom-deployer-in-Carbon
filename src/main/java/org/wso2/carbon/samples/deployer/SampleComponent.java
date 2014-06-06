package org.wso2.carbon.samples.deployer;

import org.osgi.service.component.ComponentContext;

/**
 * Created by jayanga on 6/6/14.
 *
 * The Declarative Service Component for AdminService, ServerConfigurationService and ConfigurationContextService
 *
 * @scr.component name="org.wso2.carbon.samples.deployer.SampleComponent"
 *                immediate="true"
 */
public class SampleComponent {
    protected void activate(ComponentContext componentContext){
        System.out.println("=== SampleComponent activate ===");
    }

    protected void deactivate(ComponentContext componentContext) {
        System.out.println("=== SampleComponent deactivate ===");
    }
}
