package com.theprogrammingturkey.comz.commands;

import com.theprogrammingturkey.comz.game.Game;
import com.theprogrammingturkey.comz.game.GameManager;
import com.theprogrammingturkey.comz.util.CommandUtil;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class LeaveCommand implements SubCommand
{

	@Override
	public boolean onCommand(Player player, String[] args)
	{
		if(player.hasPermission("zombies.leave") || player.hasPermission("zombies.user") || player.hasPermission("zombies.admin"))
		{
			for(Game gm : GameManager.INSTANCE.getGames())
			{
				for(int i = 0; i < gm.players.size(); i++)
				{
					if(gm.players.get(i).getName().equalsIgnoreCase(player.getName()))
					{
						gm.removePlayer(player);
						CommandUtil.sendMessageToPlayer(player, ChatColor.GOLD + "You have left the game!");
						return true;
					}
				}
			}
			CommandUtil.sendMessageToPlayer(player, ChatColor.RED + "You are not in game!");
		}
		else
		{
			CommandUtil.noPermission(player, "leave this game");
		}
		return true;
	}

}
