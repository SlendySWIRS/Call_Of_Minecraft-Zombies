package com.theprogrammingturkey.comz.kits;

import com.theprogrammingturkey.comz.game.features.PerkType;
import com.theprogrammingturkey.comz.game.weapons.Weapon;

import java.util.List;

public class RoundReward
{
	private final int roundEnd;
	private final int points;
	private final List<Weapon> weapons;
	private final List<PerkType> perks;

	public RoundReward(int roundEnd, int points, List<Weapon> weapons, List<PerkType> perks)
	{
		this.roundEnd = roundEnd;
		this.points = points;
		this.weapons = weapons;
		this.perks = perks;
	}

	public int getRoundEnd()
	{
		return roundEnd;
	}

	public int getPoints()
	{
		return points;
	}

	public List<Weapon> getWeapons()
	{
		return weapons;
	}

	public List<PerkType> getPerks()
	{
		return perks;
	}
}
