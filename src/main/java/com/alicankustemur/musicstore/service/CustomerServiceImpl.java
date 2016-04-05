package com.alicankustemur.musicstore.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alicankustemur.musicstore.dao.JdbcTemplateCustomerRepositoryImpl;
import com.alicankustemur.musicstore.model.Album;
import com.alicankustemur.musicstore.model.Customer;

public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	private JdbcTemplateCustomerRepositoryImpl customerRepository;

	public JdbcTemplateCustomerRepositoryImpl getCustomerRepository()
	{
		return customerRepository;
	}

	public void setCustomerRepository(JdbcTemplateCustomerRepositoryImpl customerRepository)
	{
		this.customerRepository = customerRepository;
	}

	public void saveCustomer(String name, String surname, Album album)
	{
		Customer dbCustomer = customerRepository.getCustomerByName(name);

		Customer customer = new Customer();

		if (dbCustomer == null)
		{
			customer.setName(name);
			customer.setSurname(surname);
			customer.setAlbum(album);
			customerRepository.save(customer);
			System.out.println(name + " customer saved.");
		}
		else
		{
			System.out.println(dbCustomer.getName() + " is already exists in database.");
		}

	}

	public Customer getCustomerByName(String name)
	{
		return customerRepository.getCustomerByName(name);
	}

}
