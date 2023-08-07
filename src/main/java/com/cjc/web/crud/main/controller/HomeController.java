package com.cjc.web.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.web.crud.main.model.Audit;
import com.cjc.web.crud.main.serviceI.HomeServiceI;


@RestController
public class HomeController {
	
	    @Autowired
	    HomeServiceI hsi;
	    
	    @PostMapping("/insertData")
	    public String insertData(@RequestBody Audit a)
	    {
	    	 hsi.saveData(a);
			return "Insert data Successfully";
	    	
	    }
	    @GetMapping("/getsingleData/{aid}")
	    public Audit getsingleData(@PathVariable("aid")int aid )
	    {
	    	Audit a=hsi.getsingleData(aid);
			return a;
	    	
	    }
	    
	    @GetMapping("/getAllData")
	    public Iterable<Audit> getAllData()
	    {
	    	Iterable<Audit>list=hsi.displayAll();
			return list;
	    	
	    }
        
	    @PutMapping("/updateData/{aid}")
	    public String updateData(@PathVariable ("aid")int aid,@RequestBody Audit a)
	    {
	    	hsi.saveData(a);
			return "update Data successfully";
	    	
	    }
	    @DeleteMapping("/deleteData/{aid}")
	    public String deleteData(@PathVariable("aid")int aid,@RequestBody Audit a)
	    {
	    	  hsi.deleteData(a);
			return "delete Data Successfully";
	    	
	    }
	    
	   
} 
