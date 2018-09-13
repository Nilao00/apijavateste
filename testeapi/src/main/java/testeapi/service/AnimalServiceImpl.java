package testeapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import testeapi.dao.AnimalDao;
import testeapi.model.animal;

@Service
@Transactional
public class AnimalServiceImpl implements AnimalService {
 
 AnimalDao animaldao;
 
 @Autowired
 public void setAnimalDao(AnimalDao animalDao) {
  this.animaldao = animalDao;
 }

public List getListAnimal() {
	 return animaldao.getListAnimal();
}

public void saveOrUpdate(animal animal) {
	animaldao.saveOrUpdate(animal);
	
}

public void deleteAnimal(int id_Animal) {
	 animaldao.deleteAnimal(id_Animal);
	
}

public animal findAnimalById(int id_Animal) {
	return animaldao.findUserByAnimal(id_Animal);
}







}

