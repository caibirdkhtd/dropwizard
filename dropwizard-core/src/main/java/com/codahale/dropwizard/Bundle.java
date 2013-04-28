package com.codahale.dropwizard;

import com.codahale.dropwizard.setup.Bootstrap;
import com.codahale.dropwizard.setup.Environment;

/**
 * A reusable bundle of functionality, used to define blocks of service behavior.
 */
public interface Bundle {
    /**
     * Initializes the service bootstrap.
     *
     * @param bootstrap the service bootstrap
     */
    void initialize(Bootstrap<?> bootstrap);

    /**
     * Initializes the service environment.
     *
     * @param environment the service environment
     */
    void run(Environment environment);
}
