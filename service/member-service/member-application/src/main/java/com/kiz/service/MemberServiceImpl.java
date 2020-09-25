package com.kiz.service;

import com.kiz.dto.MemberDto;
import com.kiz.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final ModelMapper modelMapper;

    @Override
    public MemberDto signInReq(MemberDto.SignInReq dto) {
        return null;
    }

    @Override
    public MemberDto signUpReq(MemberDto.SignUpReq dto) {
        return modelMapper.map(memberRepository.save(dto.toEntity()), MemberDto.class);
    }

    @Override
    public MemberDto getMember(Long id) {
        return null;
    }

}
