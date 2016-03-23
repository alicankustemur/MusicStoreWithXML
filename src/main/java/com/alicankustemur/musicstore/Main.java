package com.alicankustemur.musicstore;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alicankustemur.musicstore.model.Album;
import com.alicankustemur.musicstore.service.AlbumService;
import com.alicankustemur.musicstore.service.CustomerService;

public class Main
{

	public static void main(String[] args) throws SQLException
	{

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AlbumService albumService = applicationContext.getBean(AlbumService.class);
		Album album = albumService.getAlbumByName("name7");
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
		customerService.getCustomerByName("Ali Can");
		
	}

}
