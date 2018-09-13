package testeapi.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import testeapi.model.ficha;
import testeapi.service.FichaService;


@RestController
public class FichaController {

 @Autowired
 FichaService fichaService;
 HttpServletResponse response;
 @CrossOrigin(origins = "http://localhost:4200")
 @RequestMapping(value="/ficha", method=RequestMethod.GET, headers="Accept=application/json")
 public @ResponseBody List getListFicha(){

	 
  List ficha= fichaService.getListFicha();
  
	  return  ficha;
  
  
	 
  
 }
 @CrossOrigin(origins = "http://localhost:4200")
 @RequestMapping(value="/ficha/{id_ficha}", method=RequestMethod.GET, headers="Accept=application/json")
 public @ResponseBody ficha find(@PathVariable("id_ficha") int id_ficha){
ficha ficha = fichaService.findFichaById(id_ficha);

  
 if(id_ficha != 0 ) {
	  
	 return  ficha;
	 
  }else {
	  ficha = null;
	  ficha.setId_ficha(0);
	  return ficha;
	  
	  
  
  }
 }
 
 @RequestMapping(value="/addFicha", method=RequestMethod.POST,headers="Accept=application/json")
 public @ResponseBody ficha add(@RequestBody ficha fich){
  //fich = (ficha) fichaService.getListFicha();
  
   

  fichaService.saveOrUpdate(fich);
 
  return fich;
  
 }
 
 @RequestMapping(value="/updateFicha/{id}", method=RequestMethod.PUT)
 public @ResponseBody ficha update(@PathVariable("id") int id, @RequestBody ficha ficha){
  ficha.setId_ficha(id);
  fichaService.saveOrUpdate(ficha);
  
  return ficha;
 }
 
 @RequestMapping(value="/deleteFicha/{id}", method=RequestMethod.DELETE)
 public @ResponseBody ficha delete(@PathVariable("id") int id_ficha){
 ficha ficha = fichaService.findFichaById(id_ficha);
  fichaService.deleteFicha(id_ficha);
  
  return ficha;
 }


}


