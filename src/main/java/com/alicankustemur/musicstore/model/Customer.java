package com.alicankustemur.musicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Customer
{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long	id;

	@Column(name = "name")
	private String	name;

	@Column(name = "surname")
	private String	surname;

	@Transient
	private Album	album;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public Album getAlbum()
	{
		return album;
	}

	public void setAlbum(Album album)
	{
		this.album = album;
	}

	@Override
	public String toString()
	{
		return "Customer [name=" + name + ", surname=" + surname + ", album=" + album + "]";
	}

}
