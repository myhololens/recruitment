package cn.soft.zhaopin.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class MainGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MainGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMainGroupIdIsNull() {
            addCriterion("main_group_id is null");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdIsNotNull() {
            addCriterion("main_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdEqualTo(Integer value) {
            addCriterion("main_group_id =", value, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdNotEqualTo(Integer value) {
            addCriterion("main_group_id <>", value, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdGreaterThan(Integer value) {
            addCriterion("main_group_id >", value, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_group_id >=", value, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdLessThan(Integer value) {
            addCriterion("main_group_id <", value, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_group_id <=", value, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdIn(List<Integer> values) {
            addCriterion("main_group_id in", values, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdNotIn(List<Integer> values) {
            addCriterion("main_group_id not in", values, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("main_group_id between", value1, value2, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_group_id not between", value1, value2, "mainGroupId");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameIsNull() {
            addCriterion("main_group_name is null");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameIsNotNull() {
            addCriterion("main_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameEqualTo(String value) {
            addCriterion("main_group_name =", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameNotEqualTo(String value) {
            addCriterion("main_group_name <>", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameGreaterThan(String value) {
            addCriterion("main_group_name >", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_group_name >=", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameLessThan(String value) {
            addCriterion("main_group_name <", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameLessThanOrEqualTo(String value) {
            addCriterion("main_group_name <=", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameLike(String value) {
            addCriterion("main_group_name like", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameNotLike(String value) {
            addCriterion("main_group_name not like", value, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameIn(List<String> values) {
            addCriterion("main_group_name in", values, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameNotIn(List<String> values) {
            addCriterion("main_group_name not in", values, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameBetween(String value1, String value2) {
            addCriterion("main_group_name between", value1, value2, "mainGroupName");
            return (Criteria) this;
        }

        public Criteria andMainGroupNameNotBetween(String value1, String value2) {
            addCriterion("main_group_name not between", value1, value2, "mainGroupName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}