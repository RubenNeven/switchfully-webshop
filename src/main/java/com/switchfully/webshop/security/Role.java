package com.switchfully.webshop.security;

import com.google.common.collect.Lists;

import static com.switchfully.webshop.security.Feature.*;
import java.util.List;

public enum Role {
    MANAGER("admin", GET_ALL_ITEMS, CREATE_CUSTOMER, UPDATE_ITEM, GET_ALL_CUSTOMERS),
    MEMBER("member", CREATE_CUSTOMER);

    private final String label;
    private final List<Feature> featureList;

    Role(String label, Feature... featureList) {
        this.label = label;
        this.featureList = Lists.newArrayList(featureList);
    }

    public List<Feature> getFeatures() {
        return featureList;
    }

    public String getLabel() {
        return label;
    }
}

