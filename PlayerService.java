package com.player.service;

import com.player.dao.PlayerDao;
import com.player.model.Player;

public class PlayerService {
	public static void main(String[] args) {
		// day mon dd time timezone yyyy

		Player player=new Player(new java.util.Date(), "", "Rohith", "Sharma", "India", 0);

		PlayerDao dao=new PlayerDao();
		String res= dao.savePlayer(player);
		System.out.println(res);
		}
}
