package com.example.demo.dto;
import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import com.example.demo.form.ExpencesForm;

import lombok.Data;
/**
 * ユーザー情報一覧画面用 データクラス
 */
@Data
public class ExpencesListParam implements Serializable {
  /**
   * ユーザー情報リスト
   */
  @Valid
  private List<ExpencesForm> userDataList;
}