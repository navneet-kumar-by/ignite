package com.gridgain.demo.ignitespringdatademo.keyValue;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;

public class Demo {
    Ignite ignite = Ignition.ignite();
    IgniteCache<Integer, String> cache = ignite.cache("myCache");

}
