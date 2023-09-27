package lk.ijse.carhire_new1.service;

import lk.ijse.carhire_new1.dao.SuperDao;
import lk.ijse.carhire_new1.dao.custom.impl.*;
import lk.ijse.carhire_new1.dao.util.DaoType;
import lk.ijse.carhire_new1.dao.util.exception.DaoNotImplemented;
import lk.ijse.carhire_new1.service.custom.impl.CustomerServiceImpl;
import lk.ijse.carhire_new1.service.util.ServiceType;

public class ServiceFactory {
    private static ServiceFactory instance;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance == null ? instance = new ServiceFactory() : instance;
    }

    public <T extends SuperService> T getService(ServiceType type) {
        switch (type) {
            case Customer_Service:
                return (T) new CustomerServiceImpl();
            default:
                throw new RuntimeException();
        }
    }
}
