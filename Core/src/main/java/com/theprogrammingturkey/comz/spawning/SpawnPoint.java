package com.theprogrammingturkey.comz.spawning;

import org.bukkit.Location;
import org.bukkit.Material;

import com.theprogrammingturkey.comz.game.Game;

public class SpawnPoint
{

	private final Location loc;
	private final Game game;
	private Material mat;
	private final String id;

	public SpawnPoint(Location loc, Game game, Material material, String id)
	{
		this.game = game;
		this.loc = loc;
		mat = material;
		this.id = id;
	}

	public Location getLocation()
	{
		return loc;
	}

	public Game getGame()
	{
		return game;
	}

	public void setMaterial(Material mat)
	{
		this.mat = mat;
	}

	public Material getMaterial()
	{
		return mat;
	}

	public String toString()
	{
		return "<SpawnPoint: " + game.getName() + "> LOC X: " + loc.getBlockX() + ", Y: " + loc.getBlockY() + ", Z: " + loc.getBlockZ() + "| Material: " + mat.toString() + "> ID " + id;
	}

	public String getID()
	{
		return id;
	}
}
