package com.company.app.board.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.app.board.BoardVO;

@Repository
public class BoardDAOMybatis {
	@Autowired SqlSessionTemplate mybatis;
	
	// 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("mybatis insertBoard() 실행");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	// 단건조회
	public BoardVO getBoard(BoardVO vo) {
		return mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	// 전체 조회
	public List<BoardVO> getBoardList(){
		System.out.println("mybatis getBoardlist() 실행");
		return mybatis.selectList("BoardDAO.getBoardlist");
	}
}
