package com.gridgain.demo.ignitespringdatademo.config;

import org.apache.ignite.Ignite;
import org.apache.ignite.configuration.DataStorageConfiguration;
import org.apache.ignite.configuration.PersistentStoreConfiguration;
import org.apache.ignite.springframework.boot.autoconfigure.IgniteConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
    @Bean(name = "igniteInstance")
    public Ignite igniteInstance(Ignite ignite) {
        return ignite;
    }

    @Bean
    public IgniteConfigurer configurer() {
//        DataStorageConfiguration storageCfg = new DataStorageConfiguration();
//        storageCfg.getDefaultDataRegionConfiguration().setPersistenceEnabled(true);

        return igniteConfiguration -> {
            igniteConfiguration.setClientMode(false);
//            igniteConfiguration.setDataStorageConfiguration(storageCfg);

        };
    }
}