package services;

import java.util.List;

import model.City;

import org.springframework.beans.factory.annotation.Autowired;

import dao.DataDao;

public class DataServicesImpl  implements DataServices{

	@Autowired
	DataDao dataDao;

	public City getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	public List<City> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

}
