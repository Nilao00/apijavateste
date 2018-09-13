package testeapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import testeapi.model.animal;


@Repository
public class AnimalDaoImpl implements AnimalDao {
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

@SuppressWarnings("unchecked")
public List getListAnimal() {
	 Criteria criteria = getSession().createCriteria(animal.class);
	  
	  return (List) criteria.list();
}

public void saveOrUpdate(animal animal) {
	  getSession().saveOrUpdate(animal);
	
}

public void deleteAnimal(int id_animal) {
	 animal animal = (animal) getSession().get(animal.class, id_animal);
	  getSession().delete(animal);
	
}

public animal findUserByAnimal(int id_Animal) {
	  return (animal) getSession().get(animal.class, id_Animal);
}




	
}

