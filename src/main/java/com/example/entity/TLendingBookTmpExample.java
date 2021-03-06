package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TLendingBookTmpExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public TLendingBookTmpExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
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
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBookIdIsNull() {
            addCriterion("BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("BOOK_ID =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("BOOK_ID <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("BOOK_ID >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_ID >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("BOOK_ID <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("BOOK_ID <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("BOOK_ID like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("BOOK_ID not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("BOOK_ID in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("BOOK_ID not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("BOOK_ID between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("BOOK_ID not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLendingDateIsNull() {
            addCriterion("LENDING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLendingDateIsNotNull() {
            addCriterion("LENDING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLendingDateEqualTo(Date value) {
            addCriterionForJDBCDate("LENDING_DATE =", value, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LENDING_DATE <>", value, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LENDING_DATE >", value, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LENDING_DATE >=", value, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateLessThan(Date value) {
            addCriterionForJDBCDate("LENDING_DATE <", value, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LENDING_DATE <=", value, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateIn(List<Date> values) {
            addCriterionForJDBCDate("LENDING_DATE in", values, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LENDING_DATE not in", values, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LENDING_DATE between", value1, value2, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andLendingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LENDING_DATE not between", value1, value2, "lendingDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RETURN_DATE >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("RETURN_DATE <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("RETURN_DATE in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RETURN_DATE not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RETURN_DATE between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RETURN_DATE not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andMngUserIdIsNull() {
            addCriterion("MNG_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMngUserIdIsNotNull() {
            addCriterion("MNG_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMngUserIdEqualTo(String value) {
            addCriterion("MNG_USER_ID =", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotEqualTo(String value) {
            addCriterion("MNG_USER_ID <>", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdGreaterThan(String value) {
            addCriterion("MNG_USER_ID >", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("MNG_USER_ID >=", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdLessThan(String value) {
            addCriterion("MNG_USER_ID <", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdLessThanOrEqualTo(String value) {
            addCriterion("MNG_USER_ID <=", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdLike(String value) {
            addCriterion("MNG_USER_ID like", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotLike(String value) {
            addCriterion("MNG_USER_ID not like", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdIn(List<String> values) {
            addCriterion("MNG_USER_ID in", values, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotIn(List<String> values) {
            addCriterion("MNG_USER_ID not in", values, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdBetween(String value1, String value2) {
            addCriterion("MNG_USER_ID between", value1, value2, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotBetween(String value1, String value2) {
            addCriterion("MNG_USER_ID not between", value1, value2, "mngUserId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated do_not_delete_during_merge Sat Apr 14 22:01:22 JST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_lending_book_tmp
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
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