package com.devops.finalProject;

import com.codahale.metrics.*;
import com.codahale.metrics.graphite.*;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

public class MetricsSetup {
    public static final MetricRegistry registry = new MetricRegistry();
    public static final Counter conversionCounter = registry.counter("conversion.count");

    public static void start() {
        Graphite graphite = new Graphite(new InetSocketAddress("localhost", 2003));
        GraphiteReporter reporter = GraphiteReporter.forRegistry(registry)
                .prefixedWith("temperature.converter")
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build(graphite);
        reporter.start(10, TimeUnit.SECONDS);
    }
}
