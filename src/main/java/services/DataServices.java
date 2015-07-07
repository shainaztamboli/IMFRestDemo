package services;

import java.util.List;

import model.City;

public interface DataServices {
 public City getEntityById(long id) throws Exception;
 public List<City> getEntityList() throws Exception;
}

