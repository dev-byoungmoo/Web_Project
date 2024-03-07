package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
//	@Test
//	public void testExits() {
//		log.info(service);
//		assertNotNull(service);
//	}
	
//	@Test
//	public void registerTest() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운글입니다.");
//		board.setContent("새로운내용입니다.");
//		board.setWriter("newnew쓰기");
//		
//		service.register(board);
//		
//		log.info("생성된 게시물의 번호는 = " + board.getBno());
//	}
	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(Board -> log.info(Board));
//	}
	
//	@Test
//	public void testGet() {
//		log.info(service.get(25L));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("삭제된 번호 = " + service.remove(25L));
//	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(1L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("제목을 수정쓰합니다.");
		log.info("testUpdate" + service.modify(board));
		
	}
}
