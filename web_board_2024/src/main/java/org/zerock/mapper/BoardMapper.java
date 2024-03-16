package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	public void insert(BoardVO boardVO);
	public void insertSelectKey(BoardVO boardVO);
	public BoardVO read(Long bno);
	public int delete(Long bno);
	public int update(BoardVO boardVO);
	public List<BoardVO> getListWithPaging(Criteria cri);
}
