package com.leoric.code.design.pattern.builder;

/**
 * Created by wecash on 18/7/19.
 */
public class Request {

    private String name;

    private String reason;

    private int days;

    private String groupLeaderInfo;

    private String managerInfo;

    private String departmentHeaderInfo;

    private String customInfo;

    public Request(Builder builder) {
        super();
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentHeaderInfo = builder.departmentHeaderInfo;
        this.customInfo = builder.customInfo;
    }

    public static class Builder {
        private String name;

        private String reason;

        private int days;

        private String groupLeaderInfo;

        private String managerInfo;

        private String departmentHeaderInfo;

        private String customInfo;

        public Builder() {
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getReason() {
            return reason;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public int getDays() {
            return days;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public String getGroupLeaderInfo() {
            return groupLeaderInfo;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public String getManagerInfo() {
            return managerInfo;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public String getDepartmentHeaderInfo() {
            return departmentHeaderInfo;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public String getCustomInfo() {
            return customInfo;
        }

        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }
}
