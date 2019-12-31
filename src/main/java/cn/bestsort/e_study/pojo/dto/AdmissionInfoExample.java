package cn.bestsort.e_study.pojo.dto;

import java.util.ArrayList;
import java.util.List;

public class AdmissionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmissionInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNull() {
            addCriterion("policy is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNotNull() {
            addCriterion("policy is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyEqualTo(String value) {
            addCriterion("policy =", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotEqualTo(String value) {
            addCriterion("policy <>", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThan(String value) {
            addCriterion("policy >", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("policy >=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThan(String value) {
            addCriterion("policy <", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThanOrEqualTo(String value) {
            addCriterion("policy <=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLike(String value) {
            addCriterion("policy like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotLike(String value) {
            addCriterion("policy not like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyIn(List<String> values) {
            addCriterion("policy in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotIn(List<String> values) {
            addCriterion("policy not in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyBetween(String value1, String value2) {
            addCriterion("policy between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotBetween(String value1, String value2) {
            addCriterion("policy not between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionIsNull() {
            addCriterion("policy_description is null");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionIsNotNull() {
            addCriterion("policy_description is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionEqualTo(String value) {
            addCriterion("policy_description =", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionNotEqualTo(String value) {
            addCriterion("policy_description <>", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionGreaterThan(String value) {
            addCriterion("policy_description >", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("policy_description >=", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionLessThan(String value) {
            addCriterion("policy_description <", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionLessThanOrEqualTo(String value) {
            addCriterion("policy_description <=", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionLike(String value) {
            addCriterion("policy_description like", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionNotLike(String value) {
            addCriterion("policy_description not like", value, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionIn(List<String> values) {
            addCriterion("policy_description in", values, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionNotIn(List<String> values) {
            addCriterion("policy_description not in", values, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionBetween(String value1, String value2) {
            addCriterion("policy_description between", value1, value2, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andPolicyDescriptionNotBetween(String value1, String value2) {
            addCriterion("policy_description not between", value1, value2, "policyDescription");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNull() {
            addCriterion("school_year is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNotNull() {
            addCriterion("school_year is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearEqualTo(Integer value) {
            addCriterion("school_year =", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotEqualTo(Integer value) {
            addCriterion("school_year <>", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThan(Integer value) {
            addCriterion("school_year >", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_year >=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThan(Integer value) {
            addCriterion("school_year <", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThanOrEqualTo(Integer value) {
            addCriterion("school_year <=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIn(List<Integer> values) {
            addCriterion("school_year in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotIn(List<Integer> values) {
            addCriterion("school_year not in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearBetween(Integer value1, Integer value2) {
            addCriterion("school_year between", value1, value2, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotBetween(Integer value1, Integer value2) {
            addCriterion("school_year not between", value1, value2, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIsNull() {
            addCriterion("school_type is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIsNotNull() {
            addCriterion("school_type is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeEqualTo(Byte value) {
            addCriterion("school_type =", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotEqualTo(Byte value) {
            addCriterion("school_type <>", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeGreaterThan(Byte value) {
            addCriterion("school_type >", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("school_type >=", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeLessThan(Byte value) {
            addCriterion("school_type <", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeLessThanOrEqualTo(Byte value) {
            addCriterion("school_type <=", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIn(List<Byte> values) {
            addCriterion("school_type in", values, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotIn(List<Byte> values) {
            addCriterion("school_type not in", values, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeBetween(Byte value1, Byte value2) {
            addCriterion("school_type between", value1, value2, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("school_type not between", value1, value2, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Long value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Long value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Long value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Long value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Long value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Long> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Long> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Long value1, Long value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Long value1, Long value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
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