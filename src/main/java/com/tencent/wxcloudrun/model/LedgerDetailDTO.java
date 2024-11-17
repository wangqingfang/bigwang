package com.tencent.wxcloudrun.dto;

import java.util.List;

public class LedgerDetailDTO {
    private String title;        // �˱�����
    private double total;        // �˱��ܽ��
    private double myAmount;     // ��ǰ�û��ķ�̯���
    private List<ExpenseRecordDTO> records; // ���Ѽ�¼�б�

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
