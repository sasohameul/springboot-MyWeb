package com.coding404.myweb.board.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coding404.myweb.command.BoardVO;

@Mapper
public interface BoardMapper {

	public int boardRegist(BoardVO vo);
	public ArrayList<BoardVO> getList(String id);
	public BoardVO getDetail(int board_num);



}
