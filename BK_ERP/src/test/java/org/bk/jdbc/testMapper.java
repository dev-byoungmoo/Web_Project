package org.bk.jdbc;
import org.bk.mapper.BK_Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class testMapper {
	@Setter(onMethod_ = {@Autowired})
	private BK_Mapper mapper;
	
	@Test
	public void Get_Time() {
//		log.info(mapper.getClass().getName());
//		log.info(mapper.getTime());
		log.info(mapper.getTime_v2());
	}
}



