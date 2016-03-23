package com.alicankustemur.musicstore.service;

import com.alicankustemur.musicstore.model.Album;
import com.alicankustemur.musicstore.model.Customer;

public interface CustomerService
{
	public void saveCustomer(String name, String surname, Album album);

	public Customer getCustomerByName(String name);
}
