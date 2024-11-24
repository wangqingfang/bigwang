package com.tencent.wxcloudrun.model;

import java.util.List;

public class ReportDTO {
    private int total;
    private int myAmount;
    private List<Member> members;

    // Getters and Setters

    public static class Member {
        private int id;
        private String avatarUrl;
        private String name;
        private int amount;

        // Getters and Setters
    }
}
