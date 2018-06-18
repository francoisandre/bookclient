package fr.atatorus.bookclient;

import java.lang.reflect.Field;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.ws.Service;

import org.apache.cxf.jaxws.ServiceImpl;

public class ServiceAdapter {

	private List<Service> services;

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	@PostConstruct
	public void desactivateValidation() {
		Field field = null;
		try {
			field = Service.class.getDeclaredField("delegate");
			field.setAccessible(true);
		} catch (NoSuchFieldException | SecurityException e) {
		}

		for (Service service : services) {
			Object aux = null;
			try {
				aux = field.get(service);
			}
			catch (Exception e) {
				continue;
			}
			if (aux instanceof ServiceImpl) {
				ServiceImpl serviceImpl = (ServiceImpl) aux;
				if (serviceImpl.getBus() != null) {
				//	serviceImpl.getBus().getProperties().put("set-jaxb-validation-event-handler", Boolean.FALSE);
				}
			}
		}
	}

}
