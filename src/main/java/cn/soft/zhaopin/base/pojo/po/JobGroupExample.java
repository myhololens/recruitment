package cn.soft.zhaopin.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class JobGroupExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public JobGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGoupNameIsNull() {
            addCriterion("goup_name is null");
            return (Criteria) this;
        }

        public Criteria andGoupNameIsNotNull() {
            addCriterion("goup_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoupNameEqualTo(String value) {
            addCriterion("goup_name =", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameNotEqualTo(String value) {
            addCriterion("goup_name <>", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameGreaterThan(String value) {
            addCriterion("goup_name >", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameGreaterThanOrEqualTo(String value) {
            addCriterion("goup_name >=", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameLessThan(String value) {
            addCriterion("goup_name <", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameLessThanOrEqualTo(String value) {
            addCriterion("goup_name <=", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameLike(String value) {
            addCriterion("goup_name like", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameNotLike(String value) {
            addCriterion("goup_name not like", value, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameIn(List<String> values) {
            addCriterion("goup_name in", values, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameNotIn(List<String> values) {
            addCriterion("goup_name not in", values, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameBetween(String value1, String value2) {
            addCriterion("goup_name between", value1, value2, "goupName");
            return (Criteria) this;
        }

        public Criteria andGoupNameNotBetween(String value1, String value2) {
            addCriterion("goup_name not between", value1, value2, "goupName");
            return (Criteria) this;
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

        public Criteria andGroupDetailIsNull() {
            addCriterion("group_detail is null");
            return (Criteria) this;
        }

        public Criteria andGroupDetailIsNotNull() {
            addCriterion("group_detail is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDetailEqualTo(String value) {
            addCriterion("group_detail =", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailNotEqualTo(String value) {
            addCriterion("group_detail <>", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailGreaterThan(String value) {
            addCriterion("group_detail >", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailGreaterThanOrEqualTo(String value) {
            addCriterion("group_detail >=", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailLessThan(String value) {
            addCriterion("group_detail <", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailLessThanOrEqualTo(String value) {
            addCriterion("group_detail <=", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailLike(String value) {
            addCriterion("group_detail like", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailNotLike(String value) {
            addCriterion("group_detail not like", value, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailIn(List<String> values) {
            addCriterion("group_detail in", values, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailNotIn(List<String> values) {
            addCriterion("group_detail not in", values, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailBetween(String value1, String value2) {
            addCriterion("group_detail between", value1, value2, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupDetailNotBetween(String value1, String value2) {
            addCriterion("group_detail not between", value1, value2, "groupDetail");
            return (Criteria) this;
        }

        public Criteria andGroupOtherIsNull() {
            addCriterion("group_other is null");
            return (Criteria) this;
        }

        public Criteria andGroupOtherIsNotNull() {
            addCriterion("group_other is not null");
            return (Criteria) this;
        }

        public Criteria andGroupOtherEqualTo(String value) {
            addCriterion("group_other =", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherNotEqualTo(String value) {
            addCriterion("group_other <>", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherGreaterThan(String value) {
            addCriterion("group_other >", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherGreaterThanOrEqualTo(String value) {
            addCriterion("group_other >=", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherLessThan(String value) {
            addCriterion("group_other <", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherLessThanOrEqualTo(String value) {
            addCriterion("group_other <=", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherLike(String value) {
            addCriterion("group_other like", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherNotLike(String value) {
            addCriterion("group_other not like", value, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherIn(List<String> values) {
            addCriterion("group_other in", values, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherNotIn(List<String> values) {
            addCriterion("group_other not in", values, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherBetween(String value1, String value2) {
            addCriterion("group_other between", value1, value2, "groupOther");
            return (Criteria) this;
        }

        public Criteria andGroupOtherNotBetween(String value1, String value2) {
            addCriterion("group_other not between", value1, value2, "groupOther");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job_group
     *
     * @mbg.generated do_not_delete_during_merge Mon Sep 03 17:24:50 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job_group
     *
     * @mbg.generated Mon Sep 03 17:24:50 CST 2018
     */
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