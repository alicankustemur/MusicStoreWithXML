package com.alicankustemur.musicstore.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alicankustemur.musicstore.model.Album;

public class AlbumRepositoryImpl implements AlbumRepository
{

	public void save(Album album)
	{
		album.setSolded(true);
	}

	public List<Album> getAllAlbumByArtistName(String artistName)
	{
		// VTODO Auto-generated method stub
		return null;
	}

	public void deleteByName(String name)
	{

	}

	public Album getAlbumByName(String name)
	{
		// VTODO Auto-generated method stub
		return null;
	}

}
