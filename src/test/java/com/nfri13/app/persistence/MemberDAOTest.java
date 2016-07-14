package com.nfri13.app.persistence;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nfri13.app.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;
	
	@Ignore @Test
	public void testGetTime() {
		System.out.println("getTime() 테스트 : " + dao.getTime());
	}

	@Ignore @Test
	public void testInsertMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setEmail("user@222.com");
		vo.setUserid("user");
		vo.setUsername("길동이");
		vo.setUserpw("1111");
		
		dao.insertMember(vo);
	}
	
	@Ignore @Test
	public void testReadMember() throws Exception{
		System.out.println(dao.readMember("user"));
	}
	
	@Test
	public void testReadWithPW() throws Exception{
		System.out.println(dao.readWithPW("user", "1111"));
	}
}
