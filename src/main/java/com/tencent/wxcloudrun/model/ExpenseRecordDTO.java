package com.tencent.wxcloudrun.dto;

public class ExpenseRecordDTO {
    private int id;          // ���Ѽ�¼ ID
    private String name;     // ����������
    private String category; // ���ѷ���
    private String type;     // ��̯����
    private String date;     // ��������
    private double amount;   // ���ѽ��

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
