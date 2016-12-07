package com.bt.ssp.dao.impl;

import org.springframework.stereotype.Repository;

import com.bt.ssp.dao.AbstractDao;
import com.bt.ssp.dao.CustomerDao;
import com.bt.ssp.model.Customer;

@Repository
public class CustomerDaoImpl extends AbstractDao<Integer, Customer> implements CustomerDao{

	@Override
	public Customer findById(int id) {
		return getByKey(id);
	}

}
