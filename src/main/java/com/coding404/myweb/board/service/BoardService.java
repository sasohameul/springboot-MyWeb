package com.coding404.myweb.board.service;

import java.util.ArrayList;

import com.coding404.myweb.command.BoardVO;


public interface BoardService {
	
	public int boardRegist(BoardVO vo);
	public ArrayList<BoardVO> getList(String id);
	public BoardVO getDetail(int board_num);
}
