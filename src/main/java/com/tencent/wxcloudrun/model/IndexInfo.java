package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class IndexInfo implements Serializable {

  private Integer LedgerID;

  private String LedgerName;

  private Integer MemberCount;

  private Integer RecordCount;

  private Boolean isCreator;
}