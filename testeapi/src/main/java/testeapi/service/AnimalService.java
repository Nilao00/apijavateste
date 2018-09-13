package testeapi.service;

import java.util.List;

import testeapi.model.animal;

public interface AnimalService {

public List getListAnimal();

public void saveOrUpdate(animal animal);
public void deleteAnimal(int id_Animal);
public animal findAnimalById(int id_Animal);

}

