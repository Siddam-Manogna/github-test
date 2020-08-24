package com.player.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.player.model.Player;
import com.product.dbutil.DbConn;

public class PlayerDao {
	public String generatePlayerId(String fname,String lname){
		String playerId="";
		String seqNum="";
		int seqNumber=0;
		try{
		Connection con=  DbConn.getConnect();
		String sql="select seqplayer.nextval from dual";
		PreparedStatement stat=con.prepareStatement(sql);
		ResultSet rs= stat.executeQuery();
		if(rs.next()){
		seqNumber=rs.getInt(1);
		}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		if(seqNumber < 100 && seqNumber >=10)
		seqNum="0"+seqNumber;
		else if(seqNumber<10)
		seqNum="00"+seqNumber;
		else
		seqNum=""+seqNumber;

		playerId=fname.substring(0,2)+lname.substring(0,2)+seqNum;

		return playerId;
		}
	
		public String savePlayer(Player player)
	{

	try
	{

	Connection con=DbConn.getConnect();
	String sql="insert into Player values(?,?,?,?,?,?)";
	PreparedStatement stat=con.prepareStatement(sql);

	

	java.util.Date dob=player.getPdob();

	java.sql.Date sqlDob=new java.sql.Date(dob.getTime());

	//java.sql.Date sqlDob=new java.sql.Date(dob.getYear(),dob.getMonth(),dob.getDate());

	stat.setDate(1, sqlDob);
	stat.setString(2, generatePlayerId(player.getPfName(), player.getPlName()));
	stat.setString(3, player.getPfName());
	stat.setString(4, player.getPlName());
	stat.setString(5, player.getpCountry());
	stat.setInt(6, player.getpRecords());
	

	int res=stat.executeUpdate();
	if(res>0)
	return "Player Saved";



	}
	catch (Exception e) {
	e.printStackTrace();
	}


	return "Unable to Create Player";
	}

}
