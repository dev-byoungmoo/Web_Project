package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}

//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("New Title2");
//		board.setContent("New Content2");
//		board.setWriter("hello world2");
//
//		mapper.insert(board);
//		log.info("테스트입니다 = " + board);
//	}

//	@Test
//	public void testInsert_sk() {
//		BoardVO board = new BoardVO();
//		board.setTitle("select key");
//		board.setContent("select key test");
//		board.setWriter("hello sk");
//		
//		mapper.insertSelectKey(board);
//		log.info("테스트입니다 = " + board);
//	}

//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(22L);
//		log.info("testRead() 테스트 = " + board);
//	}

//	@Test
//	public void testDelete() {
//		log.info("testDelete() 테스트 = " + mapper.delete(22L));
//	}
	
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(23L);
//		board.setTitle("udpate title");
//		board.setContent("update content");
//		board.setWriter("super_user");
//		
//		int count = mapper.update(board);
//		log.info("testUpdate() 테스트 = " + count);
//	}
	
//	테스트중.
}
