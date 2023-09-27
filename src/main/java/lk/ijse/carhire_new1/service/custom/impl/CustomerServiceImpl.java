package lk.ijse.carhire_new1.service.custom.impl;

import lk.ijse.carhire_new1.dao.custom.CustomerDao;
import lk.ijse.carhire_new1.dto.CustomerDto;
import lk.ijse.carhire_new1.service.ServiceFactory;
import lk.ijse.carhire_new1.service.custom.CustomerService;
import lk.ijse.carhire_new1.service.util.ServiceType;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;

    public CustomerServiceImpl() {
        customerDao = ServiceFactory.getInstance().getService(ServiceType.Customer_Service);
    }

    @Override
    public Boolean save(CustomerDto dto) {
        return null;
    }
}
