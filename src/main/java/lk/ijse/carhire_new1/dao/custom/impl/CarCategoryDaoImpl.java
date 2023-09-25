package lk.ijse.carhire_new1.dao.custom.impl;

import lk.ijse.carhire_new1.dao.custom.CarCategoryDao;
import lk.ijse.carhire_new1.entity.CarCategoryEntity;
import lk.ijse.carhire_new1.entity.CustomerEntity;
import org.hibernate.Session;


public class CarCategoryDaoImpl implements CarCategoryDao {

    public Boolean save(CarCategoryEntity entity, Session session) {
        session.save(entity);
        return true;
    }


    public Boolean update(CarCategoryEntity entity, Session session) {
        return null;
    }


    public Boolean delete(String id, Session session) {
        return null;
    }


    public CarCategoryEntity view(String id, Session session) {
        return null;
    }
}
