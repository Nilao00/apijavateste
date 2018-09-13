package testeapi.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import testeapi.model.animal;
import testeapi.service.AnimalService;


@RestController
public class AnimalController {

 @Autowired
 AnimalService animalService;
 HttpServletResponse response;
 CorsRegistry registry;



 @CrossOrigin(origins = "*")
 @RequestMapping(value="/animal", method=RequestMethod.GET, headers="Accept=application/json")
 public @ResponseBody List getListAnimal(){

		

  List animal= animalService.getListAnimal();
 
	  return  animal;
  
  
	 
  
 }
 
 @CrossOrigin(origins = "*")
 @RequestMapping(value="/animal/{id_Animal}", method=RequestMethod.GET, headers="Accept=application/json")
 public @ResponseBody animal find(@PathVariable("id_Animal") int id_Animal){
   

 animal animal = animalService.findAnimalById(id_Animal);
 
  
 if(id_Animal != 0 ) {
	  
	 return  animal;
	 
  }else {
	  animal = null;
	  animal.setId_Animal(0);
	  return animal;
	  
	  
  
  }
 }
 @POST
 @CrossOrigin(origins = "*")
 @RequestMapping(value="/addAnimal", method=RequestMethod.POST)
 public @ResponseBody animal add(@RequestBody animal ani){
	

  animalService.saveOrUpdate(ani);
 
  return ani;
  
 }
 
 @RequestMapping(value="/updateAnimal/{id}", method=RequestMethod.PUT)
 public @ResponseBody animal update(@PathVariable("id") int id, @RequestBody animal animal){
  animal.setId_Animal(id);
  animalService.saveOrUpdate(animal);
  
  return animal;
 }
 
 @RequestMapping(value="/deleteAnimal/{id}", method=RequestMethod.DELETE)
 public @ResponseBody animal delete(@PathVariable("id") int id_Animal){
 animal animal = animalService.findAnimalById(id_Animal);
  animalService.deleteAnimal(id_Animal);
  
  return animal;
 }


}
