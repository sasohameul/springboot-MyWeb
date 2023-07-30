package com.coding404.myweb.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public int boardRegist(BoardVO vo) {
		
		return boardMapper.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList(String id) {

		
		return boardMapper.getList(id);
	}

	@Override
	public BoardVO getDetail(int board_num) {
		// TODO Auto-generated method stub
		return boardMapper.getDetail(board_num);
	}

	

}
