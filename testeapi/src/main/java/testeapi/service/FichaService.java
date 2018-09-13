package testeapi.service;

import java.util.List;

import testeapi.model.ficha;

public interface FichaService {

public List getListFicha();

public void saveOrUpdate(ficha ficha);
public void deleteFicha(int id_ficha);
public ficha findFichaById(int id_ficha);

}



