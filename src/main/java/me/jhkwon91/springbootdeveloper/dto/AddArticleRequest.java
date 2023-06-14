package me.jhkwon91.springbootdeveloper.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jhkwon91.springbootdeveloper.domain.Article;
import org.antlr.v4.runtime.misc.NotNull;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    @NotNull
    @Size(min=1, max=10)
    private String title;

    @NotNull
    private String content;

    public Article toEntity(String author) {

        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
