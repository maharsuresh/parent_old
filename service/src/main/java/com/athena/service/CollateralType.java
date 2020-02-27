package com.athena.service;

import java.util.Arrays;
import java.util.List;

public enum CollateralType {
    REAL_ESTATE("REA"), 
    BONDS("BND"), 
    MUTUAL_FUNDS("MFD"), 
    STOCKS("STK");

    private final String textValue;

    /**
     * All collateral types classified as securities.
     */
    public static final List<CollateralType> SECURITIES = Arrays.asList(BONDS,MUTUAL_FUNDS,STOCKS);

    CollateralType(final String textValue) {
        this.textValue = textValue;
    }

    @Override
    public String toString() {
        return textValue;
    }
}
