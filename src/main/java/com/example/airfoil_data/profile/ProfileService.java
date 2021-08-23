package com.example.airfoil_data.profile;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProfileService 
{
	
	public List<Profile> getProfiles()
	{
		return List.of(new Profile());
	}
}
