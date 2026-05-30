package org.example.projectboardadmin.config;

import org.example.projectboardadmin.dto.security.BoardAdminPrincipal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> Optional.ofNullable(SecurityContextHolder.getContext())
                .map(SecurityContext::getAuthentication) // 현재 인증된 사용자의 정보를 가져온다.
                .filter(Authentication::isAuthenticated) // 인증된 사용자인지 확인한다.
                .map(Authentication::getPrincipal) // 사용자 정보를 포함한 객체를 가져온다.
                .map(BoardAdminPrincipal.class::cast) // 이 객체를 정의한 사용자 정보 클래스(BoardPrincipal)로 변환한다.
                .map(BoardAdminPrincipal::getUsername); // 사용자 정보에서 사용자 이름을 추출한다.
    }
}
