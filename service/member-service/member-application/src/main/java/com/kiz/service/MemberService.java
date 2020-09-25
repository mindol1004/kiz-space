package com.kiz.service;

import com.kiz.dto.MemberDto;

public interface MemberService {

    MemberDto signInReq(MemberDto.SignInReq dto);
    MemberDto signUpReq(MemberDto.SignUpReq dto);
    MemberDto getMember(Long id);

}
