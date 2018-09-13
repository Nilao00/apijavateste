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

import testeapi.model.ficha;


@Repository
public class FichaDaoImpl implements FichaDao {
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

@SuppressWarnings("unchecked")
public List getListFicha() {
	 Criteria criteria = getSession().createCriteria(ficha.class);
	  
	  return (List) criteria.list();
}

public void saveOrUpdate(ficha ficha) {
	  getSession().saveOrUpdate(ficha);
	
}

public void deleteFicha(int id_ficha) {
	 ficha ficha = (ficha) getSession().get(ficha.class, id_ficha);
	  getSession().delete(ficha);
	
}

public ficha findUserByFicha(int id_ficha) {
	  return (ficha) getSession().get(ficha.class, id_ficha);
}




	
}


