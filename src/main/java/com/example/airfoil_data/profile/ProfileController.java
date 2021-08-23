package com.example.airfoil_data.profile;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/profile")
public class ProfileController 
{
	private final ProfileService _profileService;
	
	@Autowired
	public ProfileController(ProfileService profileService)
	{
		this._profileService = profileService;
	}
	
	@GetMapping
	public List<Profile> getProfiles()
	{
		return _profileService.getProfiles();
	}
}
