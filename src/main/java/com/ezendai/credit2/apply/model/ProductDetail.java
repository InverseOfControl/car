package com.ezendai.credit2.apply.model;

import java.math.BigDecimal;

import com.ezendai.credit2.framework.model.BaseModel;

public class ProductDetail extends BaseModel {
	private static final long serialVersionUID = -5200601342962759668L;

	/** 产品ID */
	private Long productId;

	/** 贷款产品类型（针对车贷产品细分为移交类和流通类） */
	private Integer carProductType;

	/** 综合费率 */
	private BigDecimal sumRate;
	
	/** 年利率 */
	private BigDecimal yearRate;

	/** 借款期限 */
	private Integer term;
	
	/** 借款期限名称,用来页面显示,数据库没有存储相应的数据 */
	private String termName;

	/** 借款金额下限 */
	private BigDecimal lowerLimit;

	/** 借款金额上限 */
	private BigDecimal upperLimit;

	/** 状态 */
	private Integer status;

	/** 备注 */
	private String remark;

	private Integer memberType;
	private BigDecimal monthRate;
	private BigDecimal thirdFeeRate;
	private BigDecimal riskRate;

	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public BigDecimal getSumRate() {
		return sumRate;
	}

	public void setSumRate(BigDecimal sumRate) {
		this.sumRate = sumRate;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public BigDecimal getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(BigDecimal lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public BigDecimal getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(BigDecimal upperLimit) {
		this.upperLimit = upperLimit;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Integer getCarProductType() {
		return carProductType;
	}

	public void setCarProductType(Integer carProductType) {
		this.carProductType = carProductType;
	}

	public String getTermName() {
		return termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

	public BigDecimal getYearRate() {
		return yearRate;
	}

	public void setYearRate(BigDecimal yearRate) {
		this.yearRate = yearRate;
	}

	public BigDecimal getRiskRate() {
		return riskRate;
	}

	public BigDecimal getThirdFeeRate() {
		return thirdFeeRate;
	}

	public BigDecimal getMonthRate() {
		return monthRate;
	}


}