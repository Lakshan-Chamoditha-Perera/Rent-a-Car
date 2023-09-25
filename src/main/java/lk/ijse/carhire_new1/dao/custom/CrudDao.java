package lk.ijse.carhire_new1.dao.custom;

import lk.ijse.carhire_new1.dao.SuperDao;
import lk.ijse.carhire_new1.entity.SuperEntity;
import org.hibernate.Session;

public interface CrudDao<T extends SuperEntity> extends SuperDao {
    Boolean save(T entity, Session session);

    Boolean update(T entity, Session session);

    Boolean delete(String id, Session session);

    T view(String id, Session session);
}
