package com.ezendai.credit2.system.model;

import java.util.Date;

import com.ezendai.credit2.framework.model.BaseModel;

/**
 * <pre>
 * 业务序列号
 * </pre>
 *
 * @author fangqingyuan
 * @version $Id: SysSerialNum.java, v 0.1 2014-7-5 下午2:59:33 fangqingyuan Exp $
 */
public class SysSerialNum extends BaseModel {

	private static final long serialVersionUID = 6313544886436991825L;
	
	/** 序号编码 */
	private String code;
	
	/** 当前序号 */
	private Long currSeq;
	
	/** 备注 */
	private String mark;
	
	/** 数据库时间，这个地方是一个特例，没有和数据库表中的字段对应 */
	private Date dbDate;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getCurrSeq() {
		return currSeq;
	}

	public void setCurrSeq(Long currSeq) {
		this.currSeq = currSeq;
	}

	public Date getDbDate() {
		return dbDate;
	}

	public void setDbDate(Date dbDate) {
		this.dbDate = dbDate;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
