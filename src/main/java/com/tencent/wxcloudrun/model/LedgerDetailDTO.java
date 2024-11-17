package com.tencent.wxcloudrun.dto;

import java.util.List;

public class LedgerDetailDTO {
    private String title;        // 账本标题
    private double total;        // 账本总金额
    private double myAmount;     // 当前用户的分摊金额
    private List<ExpenseRecordDTO> records; // 消费记录列表

    // Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getMyAmount() {
        return myAmount;
    }
    public void setMyAmount(double myAmount) {
        this.myAmount = myAmount;
    }
    public List<ExpenseRecordDTO> getRecords() {
        return records;
    }
    public void setRecords(List<ExpenseRecordDTO> records) {
        this.records = records;
    }
}
