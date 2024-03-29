package com.ezendai.credit2.audit.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.ezendai.credit2.framework.vo.BaseVO;

public class SyncRepaymentMsgVO  extends BaseVO {
    /**
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1549125979725680129L;

	/**主键*/
	private Long id;

    private Long loanId;

    private Long repaymentId;

    private String name;

    private String idNum;

    private String mobile;

    private Long templetId;

    private BigDecimal repayAmount;

    private Integer curTime;

    private Long productId;

    private Integer productType;

    private Integer sendtimes;

    private Integer status;

    private String msg;

    private Date buildDate;

    private Date sendDate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    private Date sendStartDate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    private Date sendEndDate;
    
    private Date returnDate;

    private Long version;
    
    private Date repayDay;
    
    private List<Integer> statusList;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    private Date buildStartDate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    private Date buildEndDate;
    

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getRepaymentId() {
        return repaymentId;
    }

    public void setRepaymentId(Long repaymentId) {
        this.repaymentId = repaymentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getTempletId() {
        return templetId;
    }

    public void setTempletId(Long templetId) {
        this.templetId = templetId;
    }

    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    public Integer getCurTime() {
        return curTime;
    }

    public void setCurTime(Integer curTime) {
        this.curTime = curTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getSendtimes() {
        return sendtimes;
    }

    public void setSendtimes(Integer sendtimes) {
        this.sendtimes = sendtimes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

	public Date getRepayDay() {
		return repayDay;
	}

	public void setRepayDay(Date repayDay) {
		this.repayDay = repayDay;
	}

	public List<Integer> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<Integer> statusList) {
		this.statusList = statusList;
	}

	public Date getSendStartDate() {
		return sendStartDate;
	}

	public void setSendStartDate(Date sendStartDate) {
		this.sendStartDate = sendStartDate;
	}

	public Date getSendEndDate() {
		return sendEndDate;
	}

	public void setSendEndDate(Date sendEndDate) {
		this.sendEndDate = sendEndDate;
	}

	public Date getBuildStartDate() {
		return buildStartDate;
	}

	public void setBuildStartDate(Date buildStartDate) {
		this.buildStartDate = buildStartDate;
	}

	public Date getBuildEndDate() {
		return buildEndDate;
	}

	public void setBuildEndDate(Date buildEndDate) {
		this.buildEndDate = buildEndDate;
	}


}