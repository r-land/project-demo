package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
public class Item {

    private Long id; //상품코드
    private String itemNm; //상품명
    private int price; //가격
    private int stockNumber;
    private String itemDetail; //상품상세설명
    private ItemSellStatus itemSelLStatus; //상품판매상태
    private LocalDateTime regTime; //등록시간
    private LocalDateTime updateTime; //수정시간
}
