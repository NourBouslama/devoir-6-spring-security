package com.Nour.animals.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Nour.animals.entities.Animal;
import com.Nour.animals.service.AnimalService;

@RestController
@RequestMapping("/api")
@CrossOrigin (origins="*")
public class AnimalRESTController {
@Autowired
AnimalService animalService;
@RequestMapping(path="all",method = RequestMethod.GET)
public List<Animal> getAllAnimals() {
return animalService.getAllAnimals();
}


@RequestMapping(value="/{numA}",method = RequestMethod.GET)
public Animal getAnimalById(@PathVariable("numA") Long numA) {
return animalService.getAnimal(numA);
 }

@RequestMapping(method = RequestMethod.POST)
public Animal createAnimal(@RequestBody Animal animal) {
return animalService.saveAnimal(animal);
}

@RequestMapping(method = RequestMethod.PUT)
public Animal updateAnimal(@RequestBody Animal animal) {
return animalService.updateAnimal(animal);
}

@RequestMapping(value="/{numA}",method = RequestMethod.DELETE)
public void Animal(@PathVariable("numA") Long numA)
{
	animalService.deleteAnimalById(numA);
}

@RequestMapping(value="/animalprop/{numP}",method = RequestMethod.GET)
public List<Animal> getAnimalsByCatId(@PathVariable("numP") Long numP) {
return animalService.findByProprietaireNumP(numP);
}


}
