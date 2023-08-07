package com.cjc.web.crud.main.serviceI;

import com.cjc.web.crud.main.model.Audit;

public interface HomeServiceI {
	
	public void saveData(Audit a);
	
	public Audit getsingleData(int a);
	
	public Iterable<Audit> displayAll();
	
  	public void deleteData(Audit a);
  

}
