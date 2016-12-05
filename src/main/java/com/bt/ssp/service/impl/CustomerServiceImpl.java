package com.bt.ssp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bt.ssp.dao.CustomerDao;
import com.bt.ssp.modal.Customer;
import com.bt.ssp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public Customer findById(int id) {
		return customerDao.findById(id);
	}

}
