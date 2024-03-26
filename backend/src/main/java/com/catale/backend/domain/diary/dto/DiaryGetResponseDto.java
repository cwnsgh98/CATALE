package com.catale.backend.domain.diary.dto;

import com.catale.backend.domain.cocktail.entity.Cocktail;
import com.catale.backend.domain.diary.entity.Diary;
import com.catale.backend.domain.image.entity.Image;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class
DiaryGetResponseDto {
    private Long id;
    private Long memberId;

    private int mood;
    private String comment;//일기 한 줄
    private String reason;
    private int emotion1;
    private int emotion2;
    private int emotion3;
    private LocalDateTime createdAt;

    private Long cocktailId;
//    private Image cocktailImage;
    private String cocktailImage;
    private String name;
    private int alc;
    private int sweet;
    private int sour;
    private int bitter;
    private int sparking;
    private String color1;
    private String color2;
    private String color3;
    private int glass;
    private String content;//칵테일 설명
    private String ingredient;
    private int base;
    private int likeCount;
    private int fruit;
//      private Cocktail cocktail;

}
