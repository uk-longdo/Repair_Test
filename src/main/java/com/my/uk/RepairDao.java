package com.my.uk;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepairDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int insertdress(Map<String, Object> map) {
		
		return sqlSession.insert("com.my.insertdress", map);
	}
	
	public List<RepairDto> relist (Map<String, Object> map){
		
		return sqlSession.selectList("com.my.relist", map);
	}
	
	
}
