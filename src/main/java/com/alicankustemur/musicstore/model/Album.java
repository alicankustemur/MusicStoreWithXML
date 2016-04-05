package com.alicankustemur.musicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Album
{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long	id;

	@Column(name = "variation")
	private String	variation;

	@Column(name = "name")
	private String	name;

	@Column(name = "artistName")
	private String	artistName;

	@Column(name = "genre")
	private String	genre;

	@Column(name = "songNumbers")
	private int		songNumbers;

	@Transient
	private boolean	solded;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getVariation()
	{
		return variation;
	}

	public void setVariation(String variation)
	{
		this.variation = variation;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getArtistName()
	{
		return artistName;
	}

	public void setArtistName(String artistName)
	{
		this.artistName = artistName;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public int getSongNumbers()
	{
		return songNumbers;
	}

	public void setSongNumbers(int songNumbers)
	{
		this.songNumbers = songNumbers;
	}

	public void setSolded(boolean solded)
	{
		this.solded = solded;
	}

	public boolean isSolded()
	{
		return solded;
	}

}
