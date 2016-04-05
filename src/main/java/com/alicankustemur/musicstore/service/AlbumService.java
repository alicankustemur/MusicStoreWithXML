package com.alicankustemur.musicstore.service;

import com.alicankustemur.musicstore.model.Album;

public interface AlbumService
{
	public Album sellAlbum(String name, String artistName, String variation, String genre, int songNumbers);

	public Album sellAlbum(Album album);

	public Album getAlbumByName(String name);
}
