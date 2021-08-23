package com.example.airfoil_data.profile;

public class Profile 
{
	private Integer _id;
	private String _naca;
	private String _seed;
	private Double _drag;
	private Double _lift;
	
	
	public Profile() {}

	public Profile(Integer id, String naca, String seed, Double drag, Double lift) 
	{
		this._id = id;
		this._naca = naca;
		this._seed = seed;
		this._lift = lift;
		this._drag = drag;
	}

	public Profile(String naca, String seed, Double drag, Double lift) 
	{
		this._naca = naca;
		this._seed = seed;
		this._lift = lift;
		this._drag = drag;
	}

	public Integer getId() 
	{
		return _id;
	}

	public void setId(Integer id) 
	{
		this._id = id;
	}

	public String getNaca() 
	{
		return _naca;
	}

	public void setNaca(String naca) 
	{
		this._naca = naca;
	}

	public String getSeed() 
	{
		return _seed;
	}

	public void setSeed(String seed) 
	{
		this._seed = seed;
	}

	public Double getLift() 
	{
		return _lift;
	}

	public void setLift(Double lift) 
	{
		this._lift = lift;
	}

	public Double getDrag() 
	{
		return _drag;
	}

	public void setDrag(Double drag) 
	{
		this._drag = drag;
	}

	@Override
	public String toString() 
	{
		return "profile [id=" + _id 
				+ ", naca=" + _naca 
				+ ", seed=" + _seed 
				+ ", drag=" + _drag 
				+ ", lift=" + _lift + "]";
	}
	
}
