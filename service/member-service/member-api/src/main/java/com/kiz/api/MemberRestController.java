package com.kiz.api;

import com.kiz.dto.MemberDto;
import com.kiz.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("/member/signup")
    public MemberDto signUp(@RequestBody MemberDto.SignUpReq dto) {
        return memberService.signUpReq(dto);
    }

    @GetMapping("/member/{memberNo}")
    public MemberDto getMember(@PathVariable Long memberNo) {
        return memberService.getMember(memberNo);
    }

}
