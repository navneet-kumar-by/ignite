package com.gridgain.demo.ignitespringdatademo.model;

import org.apache.ignite.cache.affinity.AffinityKeyMapped;

import java.io.Serializable;
import java.util.Objects;

public class CityKey implements Serializable {
    private int Id;

    @AffinityKeyMapped
    private String COUNTRYCODE;

    public CityKey(int id, String countryCode) {
        this.Id = id;
        this.COUNTRYCODE = countryCode;
    }

    public int getId() {
        return Id;
    }

    public String getCountryCode() {
        return COUNTRYCODE;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CityKey key = (CityKey)o;
        return Id == key.Id &&
                COUNTRYCODE.equals(key.COUNTRYCODE);
    }

    @Override public int hashCode() {
        return Objects.hash(Id, COUNTRYCODE);
    }
}
