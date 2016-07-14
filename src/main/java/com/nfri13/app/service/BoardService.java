package com.nfri13.app.service;

import java.util.List;

import com.nfri13.app.domain.BoardVO;

public interface BoardService {
	  public void register(BoardVO vo) throws Exception;
	  public BoardVO read(Integer bno) throws Exception;
	  public void modify(BoardVO vo) throws Exception;
	  public void remove(Integer bno) throws Exception;
	  public List<BoardVO> listAll() throws Exception;
}
