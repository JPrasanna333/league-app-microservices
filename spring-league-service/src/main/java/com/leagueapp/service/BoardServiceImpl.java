package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.Board;
import com.leagueapp.repository.IBoardRepository;
@Service
public class BoardServiceImpl implements IBoardService{

	@Autowired
	IBoardRepository ownerRepository;
	@Override
	public Board addBoard(Board board) {
		return ownerRepository.save(board);
	}
	@Override
	public void updateBoard(Board board) {
		ownerRepository.save(board);		
	}

	@Override
	public void deleteBoard(int boardId) {
		ownerRepository.deleteById(boardId);		
	}

	@Override
	public Board getById(int boardId) {
		return ownerRepository.findById(boardId).get();
	}

	@Override
	public List<Board> getAll() {
		return ownerRepository.findAll();
	}

}
