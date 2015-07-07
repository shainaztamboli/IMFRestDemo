package dao;

import java.util.List;

import model.City;

public interface DataDao {
	public City getEntityById(long id) throws Exception;

	public List<City> getEntityList() throws Exception;
}
