package com.mygame.service;
import com.mygame.dao.GameDAO;

public class GameService {
	GameDAO gdao = new GameDAO();
	String ctName[] = new String[4];
	public String[] getCityNamesService() {
		gdao.getCityName();
		return ctName;
	}
}
