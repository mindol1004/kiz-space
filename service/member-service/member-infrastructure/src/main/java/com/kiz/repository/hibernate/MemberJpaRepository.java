package com.kiz.repository.hibernate;

import com.kiz.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<Member, Long>, MemberCustomRepository {
}
