package com.cjc.web.crud.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cjc.web.crud.main.model.Audit;
import com.cjc.web.crud.main.repository.HomeRepository;
import com.cjc.web.crud.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
	
	     @Autowired
	     HomeRepository hr;

		@Override
		public void saveData(Audit a) 
		{
		     hr.save(a);
			
		}

		@Override
		public Audit getsingleData(int a)
		{
		     
			return hr.findAllByAid(a) ;
		}

		@Override
		public Iterable<Audit> displayAll()
		{
			
			return hr.findAll();
		}

		@Override
		public void deleteData(Audit a) 
		{
			hr.delete(a);
			
		}

}
