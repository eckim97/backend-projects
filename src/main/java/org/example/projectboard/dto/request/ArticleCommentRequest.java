package org.example.projectboard.dto.request;

import org.example.projectboard.dto.ArticleCommentDto;
import org.example.projectboard.dto.UserAccountDto;

/**
 * DTO for {@link org.example.projectboard.domain.ArticleComment}
 */
public record ArticleCommentRequest(Long articleId, String content) {

  public static ArticleCommentRequest of(Long articleId, String content) {
    return new ArticleCommentRequest(articleId, content);
  }

  public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
    return ArticleCommentDto.of(
            articleId,
            userAccountDto,
            content
    );
  }
}