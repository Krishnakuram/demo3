//package com.example.demo;
//
//import com.codahale.metrics.MetricRegistry;
//import com.codahale.metrics.Slf4jReporter;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.concurrent.TimeUnit;
//
//public class MetricRegistrySingleton {
//    public static final MetricRegistry metrics = new MetricRegistry();
//
//    static {
//        Logger logger = LoggerFactory.getLogger("com.example.demo");
//        final Slf4jReporter reporter = Slf4jReporter.forRegistry(metrics).outputTo(logger).convertRatesTo(TimeUnit.SECONDS).convertDurationsTo(TimeUnit.MILLISECONDS).build();
//        reporter.start(5, TimeUnit.MINUTES);
//    }
//
//    private MetricRegistrySingleton() {
//        throw new AssertionError();
//    }
//
//}
