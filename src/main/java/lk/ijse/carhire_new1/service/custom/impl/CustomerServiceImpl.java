package lk.ijse.carhire_new1.service.custom.impl;

import lk.ijse.carhire_new1.dao.DaoFactory;
import lk.ijse.carhire_new1.dao.custom.CustomerDao;
import lk.ijse.carhire_new1.dao.util.DaoType;
import lk.ijse.carhire_new1.dto.CustomerDto;
import lk.ijse.carhire_new1.entity.CustomerEntity;
import lk.ijse.carhire_new1.service.ServiceFactory;
import lk.ijse.carhire_new1.service.custom.CustomerService;
import lk.ijse.carhire_new1.service.util.ServiceType;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;

    public CustomerServiceImpl() {
        customerDao = DaoFactory.getInstance().getDao(DaoType.Customer_Dao);
    }

    @Override
    public Boolean save(CustomerDto dto) {
//        create customer entity, set values in dto to the entity and save it using customerDao
        return null;
    }
}
