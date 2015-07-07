package controller;

import java.util.List;

import model.City;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import services.DataServices;

@Controller
@RequestMapping("/cities")
public class RestController {

	@Autowired
	DataServices dataServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	/* Ger a single objct in Json form in Spring Rest Services */
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public @ResponseBody
	City getCity(@PathVariable("id") long id) {
		City city = null;
		try {
			city = dataServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return city;
	}

	/* Getting List of objects in Json format in Spring Restful Services */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<City> getCities() {

		List<City> cities = null;
		try {
			cities = dataServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}

		return cities;
	}

}