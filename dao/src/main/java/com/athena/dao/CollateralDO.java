package com.athena.dao;

import java.util.List;

import com.athena.service.Collateral;

public interface CollateralDO {

    /**
     * Retrieve collaterals for the client.
     * 
     * @param clientId client id.
     */
    List<Collateral> getAllCollaterals(long clientId);
}