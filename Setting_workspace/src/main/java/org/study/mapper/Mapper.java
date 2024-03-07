package org.study.mapper;

import org.apache.ibatis.annotations.Select;

public interface Mapper {	
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	public String getTime_v2();
}
