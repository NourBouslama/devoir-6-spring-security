package com.Nour.animals.entities;

import org.springframework.data.rest.core.config.Projection;

public interface AnimalProjection {
	@Projection(name = "nomA", types = { Animal.class })
	public interface AniamlProjection {
	public String getNomA();


}
}
