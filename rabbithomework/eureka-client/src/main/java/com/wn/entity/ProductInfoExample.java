package com.wn.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andProdutcIdIsNull() {
            addCriterion("produtc_id is null");
            return (Criteria) this;
        }

        public Criteria andProdutcIdIsNotNull() {
            addCriterion("produtc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdutcIdEqualTo(Integer value) {
            addCriterion("produtc_id =", value, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdNotEqualTo(Integer value) {
            addCriterion("produtc_id <>", value, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdGreaterThan(Integer value) {
            addCriterion("produtc_id >", value, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("produtc_id >=", value, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdLessThan(Integer value) {
            addCriterion("produtc_id <", value, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdLessThanOrEqualTo(Integer value) {
            addCriterion("produtc_id <=", value, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdIn(List<Integer> values) {
            addCriterion("produtc_id in", values, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdNotIn(List<Integer> values) {
            addCriterion("produtc_id not in", values, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdBetween(Integer value1, Integer value2) {
            addCriterion("produtc_id between", value1, value2, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("produtc_id not between", value1, value2, "produtcId");
            return (Criteria) this;
        }

        public Criteria andProdutcNameIsNull() {
            addCriterion("produtc_name is null");
            return (Criteria) this;
        }

        public Criteria andProdutcNameIsNotNull() {
            addCriterion("produtc_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdutcNameEqualTo(String value) {
            addCriterion("produtc_name =", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameNotEqualTo(String value) {
            addCriterion("produtc_name <>", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameGreaterThan(String value) {
            addCriterion("produtc_name >", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameGreaterThanOrEqualTo(String value) {
            addCriterion("produtc_name >=", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameLessThan(String value) {
            addCriterion("produtc_name <", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameLessThanOrEqualTo(String value) {
            addCriterion("produtc_name <=", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameLike(String value) {
            addCriterion("produtc_name like", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameNotLike(String value) {
            addCriterion("produtc_name not like", value, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameIn(List<String> values) {
            addCriterion("produtc_name in", values, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameNotIn(List<String> values) {
            addCriterion("produtc_name not in", values, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameBetween(String value1, String value2) {
            addCriterion("produtc_name between", value1, value2, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcNameNotBetween(String value1, String value2) {
            addCriterion("produtc_name not between", value1, value2, "produtcName");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceIsNull() {
            addCriterion("produtc_price is null");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceIsNotNull() {
            addCriterion("produtc_price is not null");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceEqualTo(BigDecimal value) {
            addCriterion("produtc_price =", value, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceNotEqualTo(BigDecimal value) {
            addCriterion("produtc_price <>", value, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceGreaterThan(BigDecimal value) {
            addCriterion("produtc_price >", value, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("produtc_price >=", value, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceLessThan(BigDecimal value) {
            addCriterion("produtc_price <", value, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("produtc_price <=", value, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceIn(List<BigDecimal> values) {
            addCriterion("produtc_price in", values, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceNotIn(List<BigDecimal> values) {
            addCriterion("produtc_price not in", values, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("produtc_price between", value1, value2, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("produtc_price not between", value1, value2, "produtcPrice");
            return (Criteria) this;
        }

        public Criteria andProdutcStockIsNull() {
            addCriterion("produtc_stock is null");
            return (Criteria) this;
        }

        public Criteria andProdutcStockIsNotNull() {
            addCriterion("produtc_stock is not null");
            return (Criteria) this;
        }

        public Criteria andProdutcStockEqualTo(Integer value) {
            addCriterion("produtc_stock =", value, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockNotEqualTo(Integer value) {
            addCriterion("produtc_stock <>", value, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockGreaterThan(Integer value) {
            addCriterion("produtc_stock >", value, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("produtc_stock >=", value, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockLessThan(Integer value) {
            addCriterion("produtc_stock <", value, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockLessThanOrEqualTo(Integer value) {
            addCriterion("produtc_stock <=", value, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockIn(List<Integer> values) {
            addCriterion("produtc_stock in", values, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockNotIn(List<Integer> values) {
            addCriterion("produtc_stock not in", values, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockBetween(Integer value1, Integer value2) {
            addCriterion("produtc_stock between", value1, value2, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProdutcStockNotBetween(Integer value1, Integer value2) {
            addCriterion("produtc_stock not between", value1, value2, "produtcStock");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("product_description is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("product_description is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("product_description =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("product_description <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("product_description >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("product_description >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("product_description <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("product_description <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("product_description like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("product_description not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("product_description in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("product_description not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("product_description between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("product_description not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductIconIsNull() {
            addCriterion("product_icon is null");
            return (Criteria) this;
        }

        public Criteria andProductIconIsNotNull() {
            addCriterion("product_icon is not null");
            return (Criteria) this;
        }

        public Criteria andProductIconEqualTo(String value) {
            addCriterion("product_icon =", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotEqualTo(String value) {
            addCriterion("product_icon <>", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconGreaterThan(String value) {
            addCriterion("product_icon >", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconGreaterThanOrEqualTo(String value) {
            addCriterion("product_icon >=", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconLessThan(String value) {
            addCriterion("product_icon <", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconLessThanOrEqualTo(String value) {
            addCriterion("product_icon <=", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconLike(String value) {
            addCriterion("product_icon like", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotLike(String value) {
            addCriterion("product_icon not like", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconIn(List<String> values) {
            addCriterion("product_icon in", values, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotIn(List<String> values) {
            addCriterion("product_icon not in", values, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconBetween(String value1, String value2) {
            addCriterion("product_icon between", value1, value2, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotBetween(String value1, String value2) {
            addCriterion("product_icon not between", value1, value2, "productIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNull() {
            addCriterion("category_type is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNotNull() {
            addCriterion("category_type is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeEqualTo(Integer value) {
            addCriterion("category_type =", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotEqualTo(Integer value) {
            addCriterion("category_type <>", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThan(Integer value) {
            addCriterion("category_type >", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_type >=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThan(Integer value) {
            addCriterion("category_type <", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("category_type <=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIn(List<Integer> values) {
            addCriterion("category_type in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotIn(List<Integer> values) {
            addCriterion("category_type not in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeBetween(Integer value1, Integer value2) {
            addCriterion("category_type between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("category_type not between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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