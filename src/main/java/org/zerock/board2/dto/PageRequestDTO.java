package org.zerock.board2.dto;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
public class PageRequestDTO {

  // 페이지
  @Builder.Default
  private int page = 1;

  // 사이즈
  @Builder.Default
  private int size = 10;

  // 페이지 번호
  // 페이지 값이 1보다 작으면 1페이지를 출력
  // 아니라면 현재 페이지 출력
  public void getPage(int page) {
    if(page < 0) {
      this.page = 1;
    }
  }


  
}
