package com.office.ex.member;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	Map<String, MemberDto> memDB = new HashMap<String, MemberDto>();
	
	public int insertNewMember(MemberDto memberDto) {
		
		memDB.put(memberDto.getMemId(), memberDto);
		
		return memDB.get(memberDto.getMemId()) != null 
				? 
				MemberService.SIGN_UP_OK
				:
				MemberService.SIGN_UP_NG;
		
	}

	public MemberDto selectMemberByMemIdAndMemPw(String memId) {
		
		//MemberDto memberDto = memDB.get(memId);
		return memDB.get(memId);
		
//		if (memberDto != null && memberDto.getMemPw().equals(memPw)) {
//			return memberDto;
//		} else {
//			return null;
//		}
//		
		
		//return memberDto;
		
	}

}