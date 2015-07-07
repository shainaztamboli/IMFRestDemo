package dao;

import java.util.List;

import model.City;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	public City getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		City city = (City) session.load(City.class, new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return city;
	}

	public List<City> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<City> cities = session.createCriteria(City.class).list();
		tx.commit();
		session.close();
		return cities;
	}

}
