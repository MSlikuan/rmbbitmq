package com.wn.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderMasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderMasterExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNull() {
            addCriterion("buyer_phone is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNotNull() {
            addCriterion("buyer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneEqualTo(String value) {
            addCriterion("buyer_phone =", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotEqualTo(String value) {
            addCriterion("buyer_phone <>", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThan(String value) {
            addCriterion("buyer_phone >", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_phone >=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThan(String value) {
            addCriterion("buyer_phone <", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThanOrEqualTo(String value) {
            addCriterion("buyer_phone <=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLike(String value) {
            addCriterion("buyer_phone like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotLike(String value) {
            addCriterion("buyer_phone not like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIn(List<String> values) {
            addCriterion("buyer_phone in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotIn(List<String> values) {
            addCriterion("buyer_phone not in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneBetween(String value1, String value2) {
            addCriterion("buyer_phone between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotBetween(String value1, String value2) {
            addCriterion("buyer_phone not between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("buyer_address is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("buyer_address is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("buyer_address =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("buyer_address <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("buyer_address >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_address >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("buyer_address <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("buyer_address <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("buyer_address like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("buyer_address not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("buyer_address in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("buyer_address not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("buyer_address between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("buyer_address not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidIsNull() {
            addCriterion("buyer_openid is null");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidIsNotNull() {
            addCriterion("buyer_openid is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidEqualTo(String value) {
            addCriterion("buyer_openid =", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidNotEqualTo(String value) {
            addCriterion("buyer_openid <>", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidGreaterThan(String value) {
            addCriterion("buyer_openid >", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_openid >=", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidLessThan(String value) {
            addCriterion("buyer_openid <", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidLessThanOrEqualTo(String value) {
            addCriterion("buyer_openid <=", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidLike(String value) {
            addCriterion("buyer_openid like", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidNotLike(String value) {
            addCriterion("buyer_openid not like", value, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidIn(List<String> values) {
            addCriterion("buyer_openid in", values, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidNotIn(List<String> values) {
            addCriterion("buyer_openid not in", values, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidBetween(String value1, String value2) {
            addCriterion("buyer_openid between", value1, value2, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andBuyerOpenidNotBetween(String value1, String value2) {
            addCriterion("buyer_openid not between", value1, value2, "buyerOpenid");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderStautsIsNull() {
            addCriterion("order_stauts is null");
            return (Criteria) this;
        }

        public Criteria andOrderStautsIsNotNull() {
            addCriterion("order_stauts is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStautsEqualTo(Byte value) {
            addCriterion("order_stauts =", value, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsNotEqualTo(Byte value) {
            addCriterion("order_stauts <>", value, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsGreaterThan(Byte value) {
            addCriterion("order_stauts >", value, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_stauts >=", value, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsLessThan(Byte value) {
            addCriterion("order_stauts <", value, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsLessThanOrEqualTo(Byte value) {
            addCriterion("order_stauts <=", value, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsIn(List<Byte> values) {
            addCriterion("order_stauts in", values, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsNotIn(List<Byte> values) {
            addCriterion("order_stauts not in", values, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsBetween(Byte value1, Byte value2) {
            addCriterion("order_stauts between", value1, value2, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andOrderStautsNotBetween(Byte value1, Byte value2) {
            addCriterion("order_stauts not between", value1, value2, "orderStauts");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Byte value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Byte value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Byte value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Byte value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Byte> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Byte> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
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