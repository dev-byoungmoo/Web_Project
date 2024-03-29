package org.study.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.mapper.Mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class mapper_test {
	@Setter(onMethod_ = {@Autowired})
	private Mapper mapper;
	
//	@Test
//	public void Get_Time() {
//		log.info("여기"+mapper.getClass().getName());
//		log.info("여기"+mapper.getTime());
//	}
	
	@Test
	public void getTime_v2() {
		log.info("여기"+mapper.getClass().getName());
		log.info("여기"+mapper.getTime_v2());
	}
}
