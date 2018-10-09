package com.asiainfo.busi.sc.csf.center.valuebean;

/**
 * Copyright: Copyright (c) 2017 Asiainfo-Linkage
 *
 * @ClassName: ScNetInReq
 * @Description: 用于 用户入网
 * Modification History:
 * Date                  Author                 Version       Description
 * ---------------------------------------------------------
 * 2018/8/7     ZhangShuling       v1.0.0
 */
public class ScNetInReq {

  private String caCustId;	// 客户编号
  private String billId;	// 手机号码
  private String tradeMark;	// GT MZ
  private String custType;	// 用户子类型
  private Long initScore;	// 初识回馈积分
  private Long initYearScore;	// 初识年度价值积分
  private Integer blockFlag;	// 屏蔽标志 1表示屏蔽，0表示非屏蔽
  private String opId;	// 操作员工号
  // 与接口设计文档相比缺少组织机构编码
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

  public String getTradeMark() {
    return tradeMark;
  }

  public void setTradeMark(String tradeMark) {
    this.tradeMark = tradeMark;
  }

  public String getCustType() {
    return custType;
  }

  public void setCustType(String custType) {
    this.custType = custType;
  }

  public Long getInitScore() {
    return initScore;
  }

  public void setInitScore(Long initScore) {
    this.initScore = initScore;
  }

  public Long getInitYearScore() {
    return initYearScore;
  }

  public void setInitYearScore(Long initYearScore) {
    this.initYearScore = initYearScore;
  }

  public Integer getBlockFlag() {
    return blockFlag;
  }

  public void setBlockFlag(Integer blockFlag) {
    this.blockFlag = blockFlag;
  }

  public String getOpId() {
    return opId;
  }

  public void setOpId(String opId) {
    this.opId = opId;
  }

  public String getTransTime() {
    return transTime;
  }

  public void setTransTime(String transTime) {
    this.transTime = transTime;
  }
}
