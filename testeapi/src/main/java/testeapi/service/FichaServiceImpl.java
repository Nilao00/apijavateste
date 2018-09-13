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

import testeapi.dao.FichaDao;
import testeapi.model.ficha;

@Service
@Transactional
public class FichaServiceImpl implements FichaService {
 
 FichaDao fichadao;
 
 @Autowired
 public void setAnimalDao(FichaDao fichaDao) {
  this.fichadao = fichaDao;
 }

public List getListFicha() {
	 return fichadao.getListFicha();
}

public void saveOrUpdate(ficha ficha) {
	fichadao.saveOrUpdate(ficha);
	
}

public void deleteFicha(int id_ficha) {
	 fichadao.deleteFicha(id_ficha);
	
}

public ficha findFichaById(int id_ficha) {
	return fichadao.findUserByFicha(id_ficha);
}







}


