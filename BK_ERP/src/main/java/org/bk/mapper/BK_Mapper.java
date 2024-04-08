package org.bk.mapper;

import org.apache.ibatis.annotations.Select;

public interface BK_Mapper {
	/* 초기 Mapper Test
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	*/
	public String getTime_v2();
}
