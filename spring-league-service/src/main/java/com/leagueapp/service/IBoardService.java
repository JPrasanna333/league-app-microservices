package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Board;

public interface IBoardService {
	Board addBoard(Board board);
	void updateBoard(Board board);
	void deleteBoard(int boardId);
	Board getById(int boardId);
	List<Board> getAll();

}
