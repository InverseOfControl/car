package com.ezendai.credit2.master.dao;

import java.util.List;

import com.ezendai.credit2.framework.util.Pager;
import com.ezendai.credit2.master.model.SyncPreRepaymentInfo;
import com.ezendai.credit2.master.vo.SyncPreRepaymentInfoVO;

public interface SyncPreRepaymentInfoDao {
	
	/**
	 * 批量插入异常还款人员信息
	 * @param syncLoan
	 */
	public void batchInsert(List<SyncPreRepaymentInfo> syncPreRepaymentInfos);
	
	/**
	 * 查询异常借款信息
	 * @param syncPreRepaymentInfo
	 * @return
	 */
	public List<SyncPreRepaymentInfo>queryPreRepayInfo(SyncPreRepaymentInfo syncPreRepaymentInfo);
	
	/**
	 * 查询提前一次性还款数据（同步表）
	 * @param syncPreRepaymentInfoVO
	 * @return
	 */
	public Pager findList(SyncPreRepaymentInfoVO syncPreRepaymentInfoVO);
	
	/**
	 * 更新同步状态
	 */
	public void updateSyncStatus(SyncPreRepaymentInfo syncPreRepaymentInfo);
	
}
