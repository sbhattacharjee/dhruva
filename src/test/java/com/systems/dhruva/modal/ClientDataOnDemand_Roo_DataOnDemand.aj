// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.systems.dhruva.modal;

import com.systems.dhruva.modal.Client;
import com.systems.dhruva.modal.ClientDataOnDemand;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect ClientDataOnDemand_Roo_DataOnDemand {
    
    declare @type: ClientDataOnDemand: @Component;
    
    private Random ClientDataOnDemand.rnd = new SecureRandom();
    
    private List<Client> ClientDataOnDemand.data;
    
    public Client ClientDataOnDemand.getNewTransientClient(int index) {
        Client obj = new Client();
        setClientName(obj, index);
        setContactNumber(obj, index);
        setStreetAddress(obj, index);
        setURL(obj, index);
        return obj;
    }
    
    public void ClientDataOnDemand.setClientName(Client obj, int index) {
        String clientName = "clientName_" + index;
        obj.setClientName(clientName);
    }
    
    public void ClientDataOnDemand.setContactNumber(Client obj, int index) {
        Integer contactNumber = new Integer(index);
        obj.setContactNumber(contactNumber);
    }
    
    public void ClientDataOnDemand.setStreetAddress(Client obj, int index) {
        String streetAddress = "streetAddress_" + index;
        obj.setStreetAddress(streetAddress);
    }
    
    public void ClientDataOnDemand.setURL(Client obj, int index) {
        String URL = "URL_" + index;
        obj.setURL(URL);
    }
    
    public Client ClientDataOnDemand.getSpecificClient(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Client obj = data.get(index);
        Long id = obj.getId();
        return Client.findClient(id);
    }
    
    public Client ClientDataOnDemand.getRandomClient() {
        init();
        Client obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Client.findClient(id);
    }
    
    public boolean ClientDataOnDemand.modifyClient(Client obj) {
        return false;
    }
    
    public void ClientDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Client.findClientEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Client' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Client>();
        for (int i = 0; i < 10; i++) {
            Client obj = getNewTransientClient(i);
            try {
                obj.persist();
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
