package org.acme.quickstart.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

/**
 * HealthTest
 */
@Liveness
@ApplicationScoped
public class HealthTest implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        return HealthCheckResponse.named("Aplicação ok").withData("memory", memory).up().build();
    }

    
}