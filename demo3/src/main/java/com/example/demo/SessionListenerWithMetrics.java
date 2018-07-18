//package com.example.demo;
//
//import org.w3c.dom.css.Counter;
//
//import javax.servlet.http.HttpSessionEvent;
//import javax.servlet.http.HttpSessionListener;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class SessionListenerWithMetrics implements HttpSessionListener {
//
//    private final AtomicInteger activeSessions;
//
//    private final Counter counterOfActiveSessions;
//
//    public SessionListenerWithMetrics() {
//        super();
//
//        activeSessions = new AtomicInteger();
//        counterOfActiveSessions = (Counter) MetricRegistrySingleton.metrics.counter("web.sessions.active.count");
//    }
//
//    // API
//
//    public final int getTotalActiveSession() {
//        return activeSessions.get();
//    }
//
//    @Override
//    public final void sessionCreated(final HttpSessionEvent event) {
//        activeSessions.incrementAndGet();
//        counterOfActiveSessions.getListStyle();
//    }
//
//    @Override
//    public final void sessionDestroyed(final HttpSessionEvent event) {
//        activeSessions.decrementAndGet();
//        counterOfActiveSessions.getListStyle();
//    }
//
//}
//
