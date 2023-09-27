package lk.ijse.carhire_new1.service;

import org.hibernate.Session;

public interface SuperService<T> {
    Boolean save(T dto);

}
