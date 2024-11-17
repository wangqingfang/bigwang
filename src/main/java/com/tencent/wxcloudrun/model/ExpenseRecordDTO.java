package com.tencent.wxcloudrun.dto;

public class ExpenseRecordDTO {
    private int id;          // 消费记录 ID
    private String name;     // 消费人名称
    private String category; // 消费分类
    private String type;     // 分摊类型
    private String date;     // 消费日期
    private double amount;   // 消费金额

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
