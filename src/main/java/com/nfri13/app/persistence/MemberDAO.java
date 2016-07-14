package com.nfri13.app.persistence;

import com.nfri13.app.domain.MemberVO;

public interface MemberDAO {
	public String getTime(); //DB서버 시간에대한 정보 필요할때 사용가능
	public void insertMember(MemberVO vo);
	public MemberVO readMember(String userid) throws Exception;
	public MemberVO readWithPW(String userid, String userpw) throws Exception;
	//인증이 필요할시 아이디와 패스워드로 회원정보를 가져오기
}
