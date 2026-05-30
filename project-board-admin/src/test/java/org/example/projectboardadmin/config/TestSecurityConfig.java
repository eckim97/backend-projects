package org.example.projectboardadmin.config;

import org.example.projectboardadmin.domain.constant.RoleType;
import org.example.projectboardadmin.dto.AdminAccountDto;
import org.example.projectboardadmin.service.AdminAccountService;
import org.mockito.ArgumentMatchers;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;
import java.util.Set;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
@TestConfiguration
public class TestSecurityConfig {
    @MockBean private AdminAccountService adminAccountService;

    @BeforeTestMethod
    public void securitySetup() {
        given(adminAccountService.searchUser(anyString()))
                .willReturn(Optional.of(createAdminAccountDto()));
        given(adminAccountService.saveUser(anyString(), anyString(), anySet(), anyString(), anyString(), anyString()))
                .willReturn(createAdminAccountDto());
    }

    private AdminAccountDto createAdminAccountDto() {
        return AdminAccountDto.of(
                "ecTest",
                "pw",
                Set.of(RoleType.USER),
                "eunchan-test@email.com",
                "eunchan-test",
                "test memo"
        );
    }
}