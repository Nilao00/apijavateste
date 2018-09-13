package testeapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ficha")
public class ficha {

	
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private int id_ficha;
 
 
 @Column(name="status", nullable=true)
 private String status;

 @Column(name="id_animal", nullable=true)
 private int id_animal;
 
 @Column(name="obs", nullable=true)
 private String obs;

 @Column(name="data_cadastro", nullable=true)
 private String data_cadastro;
 
 
 
public int getId_ficha() {
  return id_ficha;
 }

 public void setId_ficha(int id_ficha) {
  this.id_ficha = id_ficha;
 }

 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }

 public int getId_animal() {
  return id_animal;
}

 public void setId_animal(int id_animal) {
  this.id_animal = id_animal;
 }
 
 public String getObs() {
  return obs;
 }
public void setObs(String obs) {
  this.obs = obs;
 }

public String getData_cadastro() {
	return data_cadastro;
}
public void setData_cadastro(String data_cadastro) {
	this.data_cadastro = data_cadastro;
}
 
}

