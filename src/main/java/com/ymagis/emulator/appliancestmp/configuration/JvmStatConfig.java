package com.ymagis.emulator.appliancestmp.configuration;

import com.ymagis.emulator.appliancestmp.agent.Mib2System;
import com.ymagis.emulator.appliancestmp.annotations.MibAnnotationsProcessor;
import com.ymagis.emulator.appliancestmp.snmp.SnmpAgent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JvmStatConfig {
    @Bean
    public JvmStatAnnotated jvmStatAnnotated() {
        return new JvmStatAnnotated("JVM Statistics with Spring (Annotated)", 20);
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public SnmpAgent snmpAgent() {
        return new SnmpAgent(161, "public", "private", mib2System(), new String[]{"1.3.6.1.2.1", "1.3.6.1.4.1.28824"});
    }

    @Bean
    public Mib2System mib2System() {
        return new Mib2System("JvmStat service", "1.3.6.1.4.1.28824.99", "Marko M", "Belgrade Office", false, false, false, true, true);
    }

    @Bean
    public MibAnnotationsProcessor mibAnnotationsProcessor() {
        return new MibAnnotationsProcessor(snmpAgent());
    }
}
