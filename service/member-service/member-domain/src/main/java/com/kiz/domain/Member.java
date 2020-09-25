package com.kiz.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private long id;

    @Embedded
    private Email email;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Embedded
    private Password password;

    @Builder
    public Member(Email email, String name, Password password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

}
