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
//		board.setTitle("���ο���Դϴ�.");
//		board.setContent("���ο���Դϴ�.");
//		board.setWriter("newnew����");
//		
//		service.register(board);
//		
//		log.info("������ �Խù��� ��ȣ�� = " + board.getBno());
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
//		log.info("������ ��ȣ = " + service.remove(25L));
//	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(1L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("������ �������մϴ�.");
		log.info("testUpdate" + service.modify(board));
		
	}
}
