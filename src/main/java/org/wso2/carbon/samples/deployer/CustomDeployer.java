package org.wso2.carbon.samples.deployer;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.deployment.Deployer;
import org.apache.axis2.deployment.DeploymentException;
import org.apache.axis2.deployment.repository.util.DeploymentFileData;

/**
 * Created by jayanga on 6/6/14.
 */
public class CustomDeployer implements Deployer {
    @Override
    public void init(ConfigurationContext configurationContext) {
        System.out.println("=== CustomDeployer init ===");
    }

    @Override
    public void deploy(DeploymentFileData deploymentFileData) throws DeploymentException {
        System.out.println("=== CustomDeployer deploy ===");
        System.out.println("File name:" + deploymentFileData.getName());
    }

    @Override
    public void setDirectory(String s) {
        System.out.println("=== CustomDeployer setDirectory ===");
    }

    @Override
    public void setExtension(String s) {
        System.out.println("=== CustomDeployer setExtension ===");
    }

    @Override
    public void undeploy(String s) throws DeploymentException {
        System.out.println("=== CustomDeployer undeploy ===");
        System.out.println("File name:" + s);
    }

    @Override
    public void cleanup() throws DeploymentException {
        System.out.println("=== CustomDeployer cleanup ===");
    }
}
