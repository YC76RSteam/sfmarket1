package com.yc.market.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SfShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SfShopExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNull() {
            addCriterion("shopAddress is null");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNotNull() {
            addCriterion("shopAddress is not null");
            return (Criteria) this;
        }

        public Criteria andShopaddressEqualTo(String value) {
            addCriterion("shopAddress =", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotEqualTo(String value) {
            addCriterion("shopAddress <>", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThan(String value) {
            addCriterion("shopAddress >", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shopAddress >=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThan(String value) {
            addCriterion("shopAddress <", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThanOrEqualTo(String value) {
            addCriterion("shopAddress <=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLike(String value) {
            addCriterion("shopAddress like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotLike(String value) {
            addCriterion("shopAddress not like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressIn(List<String> values) {
            addCriterion("shopAddress in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotIn(List<String> values) {
            addCriterion("shopAddress not in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressBetween(String value1, String value2) {
            addCriterion("shopAddress between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotBetween(String value1, String value2) {
            addCriterion("shopAddress not between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopimgIsNull() {
            addCriterion("shopImg is null");
            return (Criteria) this;
        }

        public Criteria andShopimgIsNotNull() {
            addCriterion("shopImg is not null");
            return (Criteria) this;
        }

        public Criteria andShopimgEqualTo(String value) {
            addCriterion("shopImg =", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotEqualTo(String value) {
            addCriterion("shopImg <>", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgGreaterThan(String value) {
            addCriterion("shopImg >", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgGreaterThanOrEqualTo(String value) {
            addCriterion("shopImg >=", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgLessThan(String value) {
            addCriterion("shopImg <", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgLessThanOrEqualTo(String value) {
            addCriterion("shopImg <=", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgLike(String value) {
            addCriterion("shopImg like", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotLike(String value) {
            addCriterion("shopImg not like", value, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgIn(List<String> values) {
            addCriterion("shopImg in", values, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotIn(List<String> values) {
            addCriterion("shopImg not in", values, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgBetween(String value1, String value2) {
            addCriterion("shopImg between", value1, value2, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShopimgNotBetween(String value1, String value2) {
            addCriterion("shopImg not between", value1, value2, "shopimg");
            return (Criteria) this;
        }

        public Criteria andShoplogoIsNull() {
            addCriterion("shopLogo is null");
            return (Criteria) this;
        }

        public Criteria andShoplogoIsNotNull() {
            addCriterion("shopLogo is not null");
            return (Criteria) this;
        }

        public Criteria andShoplogoEqualTo(String value) {
            addCriterion("shopLogo =", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoNotEqualTo(String value) {
            addCriterion("shopLogo <>", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoGreaterThan(String value) {
            addCriterion("shopLogo >", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoGreaterThanOrEqualTo(String value) {
            addCriterion("shopLogo >=", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoLessThan(String value) {
            addCriterion("shopLogo <", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoLessThanOrEqualTo(String value) {
            addCriterion("shopLogo <=", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoLike(String value) {
            addCriterion("shopLogo like", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoNotLike(String value) {
            addCriterion("shopLogo not like", value, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoIn(List<String> values) {
            addCriterion("shopLogo in", values, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoNotIn(List<String> values) {
            addCriterion("shopLogo not in", values, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoBetween(String value1, String value2) {
            addCriterion("shopLogo between", value1, value2, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShoplogoNotBetween(String value1, String value2) {
            addCriterion("shopLogo not between", value1, value2, "shoplogo");
            return (Criteria) this;
        }

        public Criteria andShopIntroIsNull() {
            addCriterion("shop_intro is null");
            return (Criteria) this;
        }

        public Criteria andShopIntroIsNotNull() {
            addCriterion("shop_intro is not null");
            return (Criteria) this;
        }

        public Criteria andShopIntroEqualTo(String value) {
            addCriterion("shop_intro =", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotEqualTo(String value) {
            addCriterion("shop_intro <>", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroGreaterThan(String value) {
            addCriterion("shop_intro >", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroGreaterThanOrEqualTo(String value) {
            addCriterion("shop_intro >=", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroLessThan(String value) {
            addCriterion("shop_intro <", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroLessThanOrEqualTo(String value) {
            addCriterion("shop_intro <=", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroLike(String value) {
            addCriterion("shop_intro like", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotLike(String value) {
            addCriterion("shop_intro not like", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroIn(List<String> values) {
            addCriterion("shop_intro in", values, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotIn(List<String> values) {
            addCriterion("shop_intro not in", values, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroBetween(String value1, String value2) {
            addCriterion("shop_intro between", value1, value2, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotBetween(String value1, String value2) {
            addCriterion("shop_intro not between", value1, value2, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopProImgIsNull() {
            addCriterion("shop_pro_img is null");
            return (Criteria) this;
        }

        public Criteria andShopProImgIsNotNull() {
            addCriterion("shop_pro_img is not null");
            return (Criteria) this;
        }

        public Criteria andShopProImgEqualTo(String value) {
            addCriterion("shop_pro_img =", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgNotEqualTo(String value) {
            addCriterion("shop_pro_img <>", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgGreaterThan(String value) {
            addCriterion("shop_pro_img >", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgGreaterThanOrEqualTo(String value) {
            addCriterion("shop_pro_img >=", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgLessThan(String value) {
            addCriterion("shop_pro_img <", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgLessThanOrEqualTo(String value) {
            addCriterion("shop_pro_img <=", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgLike(String value) {
            addCriterion("shop_pro_img like", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgNotLike(String value) {
            addCriterion("shop_pro_img not like", value, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgIn(List<String> values) {
            addCriterion("shop_pro_img in", values, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgNotIn(List<String> values) {
            addCriterion("shop_pro_img not in", values, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgBetween(String value1, String value2) {
            addCriterion("shop_pro_img between", value1, value2, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andShopProImgNotBetween(String value1, String value2) {
            addCriterion("shop_pro_img not between", value1, value2, "shopProImg");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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