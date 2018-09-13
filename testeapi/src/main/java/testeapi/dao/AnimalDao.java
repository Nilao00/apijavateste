
package testeapi.dao;

import java.util.List;

import testeapi.model.animal;

public interface AnimalDao {
 
 public List getListAnimal();
 
 public void saveOrUpdate(animal animal);
 
 public void deleteAnimal(int id_animal);
 
 public animal findUserByAnimal(int id_Animal);
 

 
 
 
 
}

