package org.ibase4j.mybatis.sys.dao;

import java.util.Map;

import com.github.pagehelper.Page;

public interface SysDeptExpandMapper {

	Page<Integer> query(Map<String, Object> params);

}
