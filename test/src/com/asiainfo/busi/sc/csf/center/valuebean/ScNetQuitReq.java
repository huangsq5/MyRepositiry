package com.asiainfo.busi.sc.csf.center.valuebean;

/**
 * Copyright: Copyright (c) 2017 Asiainfo-Linkage
 *
 * @ClassName: ScNetQuitReq
 * @Description: 用于 用户离网
 * Modification History:
 * Date                  Author                 Version       Description
 * ---------------------------------------------------------
 * 2018/8/7     ZhangShuling       v1.0.0
 */
public class ScNetQuitReq {
  private String caCustId;	// 客户编号
  private String billId;	// 手机号码
  private String opId;	// 操作员工编号
  private String orgId;	// 组织机构编码
  private String transTime;	// 交易时间

  public String getCaCustId() {
    return caCustId;
  }

  public void setCaCustId(String caCustId) {
    this.caCustId = caCustId;
  }

  public String getBillId() {
    return billId;
  }

  public void setBillId(String billId) {
    this.billId = billId;
  }

  public String getOpId() {
    return opId;
  }

  public void setOpId(String opId) {
    this.opId = opId;
  }

  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public String getTransTime() {
    return transTime;
  }

  public void setTransTime(String transTime) {
    this.transTime = transTime;
  }
}
