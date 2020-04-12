package kr.co.dao;

import kr.co.vo.BoardVO;

public interface BoardDAO {

	//게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}
