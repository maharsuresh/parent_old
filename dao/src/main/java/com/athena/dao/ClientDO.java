package com.athena.dao;

import com.athena.service.Client;

public interface ClientDO {

    /**
     * Retrieves details of the client.
     * 
     * @param clientId the client id to search for.
     */
    Client getClientDetails(long clientId);

	void saveClient(Client client);
}
