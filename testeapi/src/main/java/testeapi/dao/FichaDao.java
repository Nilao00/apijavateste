package testeapi.dao;

import java.util.List;

import testeapi.model.ficha;

public interface FichaDao {
 
 public List getListFicha();
 
 public void saveOrUpdate(ficha ficha);
 
 public void deleteFicha(int id_animal);
 
 public ficha findUserByFicha(int id_Animal);
 

 
 
 
 
}

