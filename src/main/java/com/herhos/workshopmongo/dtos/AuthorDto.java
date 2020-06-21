package com.herhos.workshopmongo.dtos;

import java.io.Serializable;

import com.herhos.workshopmongo.domains.User;

public class AuthorDto implements Serializable
{	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	public AuthorDto()
	{
		super();
	}
	
	public AuthorDto(User obj)
	{
		id = obj.getId();
		name = obj.getName();
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
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
}
