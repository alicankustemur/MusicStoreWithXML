package com.alicankustemur.musicstore.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alicankustemur.musicstore.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(Customer customer) {
		// TODO Auto-generated method stub

	}

	public int[] createBatchCustomer(List<Customer> customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomerByName(String name) {
		Query query = getCurrentSession().createQuery("from Customer c where c.name=:name");
		query.setString("name", name);
		return (Customer) query.uniqueResult();
	}

}
