package com.highpowerbear.hpbanalytics.enums;

/**
 * Created by robertk on 12/16/2017.
 */
public class FilterEnums {

    public enum FilterOperatorString {
        LIKE("LIKE");

        private String sql;
        FilterOperatorString(String sql) {
            this.sql = sql;
        }
        public String getSql() {
            return sql;
        }
    }

    public enum FilterOperatorNumber {
        EQ("="),
        GT(">"),
        LT("<");

        private String sql;
        FilterOperatorNumber(String sql) {
            this.sql = sql;
        }
        public String getSql() {
            return sql;
        }
    }

    public enum FilterOperatorCalendar {
        EQ("="),
        GT(">"),
        LT("<");

        private String sql;
        FilterOperatorCalendar(String sql) {
            this.sql = sql;
        }
        public String getSql() {
            return sql;
        }
    }

    public enum FilterOperatorEnum {
        IN("IN");

        private String sql;
        FilterOperatorEnum(String sql) {
            this.sql = sql;
        }
        public String getSql() {
            return sql;
        }
    }

    public enum FilterKey {
        PROPERTY,
        OPERATOR,
        VALUE;

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    }

    public enum IbOrderFilterField {
        SYMBOL("symbol"),
        SEC_TYPE("secType"),
        SUBMIT_DATE("submitDate"),
        STATUS("status");

        private String varName;

        IbOrderFilterField(String varName) {
            this.varName = varName;
        }

        public String getVarName() {
            return varName;
        }
    }

    public enum ExecutionFilterField {
        SYMBOL("symbol"),
        SEC_TYPE("secType"),
        FILL_DATE("fillDate");

        private String varName;

        ExecutionFilterField(String varName) {
            this.varName = varName;
        }

        public String getVarName() {
            return varName;
        }
    }

    public enum TradeFilterField {
        SYMBOL("symbol"),
        SEC_TYPE("secType"),
        OPEN_DATE("openDate"),
        STATUS("status");

        private String varName;

        TradeFilterField(String varName) {
            this.varName = varName;
        }

        public String getVarName() {
            return varName;
        }
    }
}