package com.asiainfo.score.utils.common.valuebean;

public class ScCommonResp {

	private String paymentId;//积分交易流水号(如果返回结果为失败，则返回0)
	private String resultCode;//返回结果编码(0:成功；1：操作失败；)
    private String resultMsg;//对处理代码的解释
    
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
}
