package com.healthmonitor;

import org.junit.Test;
import static org.junit.Assert.*;

public class HealthMonitorTest {
    @Test
    public void testHealthReport() {
        HealthMonitor monitor = new HealthMonitor();
        String report = monitor.getSystemHealth();
        assertNotNull(report);
        assertTrue(report.contains("CPU"));
    }
}
