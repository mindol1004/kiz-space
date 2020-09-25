package com.kiz.dto;

import com.kiz.domain.Email;
import com.kiz.domain.Member;
import com.kiz.domain.Password;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

public class MemberDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SignInReq {

        @Valid
        private String email;
        private String password;

        @Builder
        public SignInReq(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Member toEntity() {
            return Member.builder()
                    .email(Email.builder().value(this.email).build())
                    .password(Password.builder().value(this.password).build())
                    .build();
        }

    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SignUpReq {

        @Valid
        private String email;

        @NotEmpty
        private String name;

        @NotEmpty
        private String password;

        @Builder
        public SignUpReq(String email, String name, String password) {
            this.email = email;
            this.name = name;
            this.password = password;
        }

        public Member toEntity() {
            return Member.builder()
                    .email(Email.builder().value(this.email).build())
                    .name(this.name)
                    .password(Password.builder().value(this.password).build())
                    .build();
        }

    }

    @Getter
    public static class Res {

        private String email;
        private String password;
        private String name;

        public Res(Member member) {
            this.email = member.getEmail().getValue();
            this.name = member.getName();
            this.password = member.getPassword().getValue();
        }

    }

}
