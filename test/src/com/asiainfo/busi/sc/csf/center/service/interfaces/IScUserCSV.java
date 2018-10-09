package com.asiainfo.busi.sc.csf.center.service.interfaces;

import com.asiainfo.busi.sc.csf.center.valuebean.ScNetInReq;
import com.asiainfo.busi.sc.csf.center.valuebean.ScNetQuitReq;
import com.asiainfo.score.utils.common.valuebean.ScCommonResp;

public interface IScUserCSV {

	/**
	 * 用户入网	创建回馈积分账户，初始化用户回馈积分和年度积分
	 * @param scNetInReq
	 * @return
	 */
	ScCommonResp netIn(ScNetInReq scNetInReq);
	
	/**
	 * 用户办理退网手续
	 * @param scNetQuitReq
	 * @return
	 */
	ScCommonResp netQuit(ScNetQuitReq scNetQuitReq);
}
