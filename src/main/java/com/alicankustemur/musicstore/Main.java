package com.alicankustemur.musicstore;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alicankustemur.musicstore.model.Album;
import com.alicankustemur.musicstore.service.AlbumService;

public class Main
{

	public static void main(String[] args) throws SQLException
	{

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		AlbumService service = applicationContext.getBean(AlbumService.class);
		Album album = service.getAlbumByName("The Wall");
		album.setName("The Wall New Release");
		service.sellAlbum(album);

	}

}
