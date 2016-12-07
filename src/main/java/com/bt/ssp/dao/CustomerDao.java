package com.bt.ssp.dao;

import com.bt.ssp.model.Customer;

public interface CustomerDao {
	Customer findById(int id);
}
