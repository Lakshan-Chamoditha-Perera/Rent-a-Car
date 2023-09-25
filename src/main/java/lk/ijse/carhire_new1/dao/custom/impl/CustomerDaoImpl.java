package lk.ijse.carhire_new1.dao.custom.impl;

import lk.ijse.carhire_new1.dao.custom.CustomerDao;
import lk.ijse.carhire_new1.entity.CustomerEntity;
import org.hibernate.Session;

public class CustomerDaoImpl implements CustomerDao {
    public Boolean save(CustomerEntity entity, Session session) {
        session.save(entity);
        return true;
    }


    public Boolean update(CustomerEntity entity, Session session) {
        return null;
    }


    public Boolean delete(String id, Session session) {
        return null;
    }


    public CustomerEntity view(String id, Session session) {
        return null;
    }
}
