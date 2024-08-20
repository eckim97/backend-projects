package org.example.projectboard.repository;

import org.example.projectboard.domain.UserAccount;
import org.example.projectboard.domain.projection.ArticleCommentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ArticleCommentProjection.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}