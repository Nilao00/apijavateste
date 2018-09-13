package testeapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class animal {

	
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private int id_Animal;
 
 
 @Column(name="nome", nullable=true)
 private String nome;

public int getId_Animal() {
  return id_Animal;
 }

 public void setId_Animal(int id_Animal) {
  this.id_Animal = id_Animal;
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }


 
}

