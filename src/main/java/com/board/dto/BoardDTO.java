package com.board.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class BoardDTO {
private int num,readcount;
private String subject,writer;
}
