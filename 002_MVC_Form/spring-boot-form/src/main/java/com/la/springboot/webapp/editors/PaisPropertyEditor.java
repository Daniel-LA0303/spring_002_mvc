package com.la.springboot.webapp.editors;

import java.beans.PropertyEditorSupport;

import com.la.springboot.webapp.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaisPropertyEditor extends PropertyEditorSupport {

	@Autowired
	private PaisService service;

	@Override
	public void setAsText(String idString) throws IllegalArgumentException {

		try {
			Integer id = Integer.parseInt(idString);
			this.setValue(service.obtenerPorId(id));
		} catch (NumberFormatException e) {
			setValue(null);
		}

	}

}
