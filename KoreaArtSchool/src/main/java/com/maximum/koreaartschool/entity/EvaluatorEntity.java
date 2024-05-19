package com.maximum.koreaartschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Setter
@Getter
@Table(name = "EVALUATOR")
public class EvaluatorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVL_NO", nullable = false)
    private Integer evlNo;

    @Column(name = "EVL_NM", length = 100, nullable = false)
    private String evlNm;

    @Column(name = "GNDR_CD", length = 20, nullable = false)
    private String gndrCd;

    @Column(name = "EVL_EML", length = 100, nullable = false)
    private String evlEml;

    @Column(name = "PWD", length = 20, nullable = false)
    private String pwd;

    @Column(name = "EVL_TEL", length = 11, nullable = false)
    private String evlTel;

    @Column(name = "EVL_OGDP", length = 200, nullable = false)
    private String evlOgdp;

    @Column(name = "ADDR", length = 320, nullable = false)
    private String addr;

    @Column(name = "ADDR_DETAIL", length = 320, nullable = false)
    private String addrDetail;

    @Column(name = "EVL_BRDT", length = 8, nullable = false)
    private String evlBrdt;

    @Column(name = "SLRY", precision = 15, scale = 2, nullable = false)
    private BigDecimal slry;

    @Column(name = "EVL_IMG", length = 2000, nullable = true)
    private String evlImg;

    @Column(name = "BANK_NM", length = 100, nullable = false)
    private String bankNm;

    @Column(name = "ACT_NO", length = 20, nullable = false)
    private String actNo;

    @Column(name = "IS_SELECTED", length = 2, nullable = false)
    private String isSelected;

    @Column(name = "IS_DELETED", length = 2, nullable = false)
    private String isDeleted;

    @Column(name = "EVL_CRT_DT", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp evlCrtDt;

    @Column(name = "DEPT_CD", length = 10, nullable = true)
    private String deptCd;

    @Column(name = "RCRT_CD", length = 10, nullable = true)
    private String rcrtCd;

    @Column(name = "EVL_STG_CD", length = 10, nullable = true)
    private String evlStgCd;

    public EvaluatorEntity() {}

    public EvaluatorEntity(String evlEml, String pwd, String evlBrdt, String evlTel) {
        this.evlEml = evlEml;
        this.pwd = pwd;
        this.evlBrdt = evlBrdt;
        this.evlTel = evlTel;
    }


    /*// Getters and Setters

    public Integer getEvlNo() {
        return evlNo;
    }

    public void setEvlNo(Integer evlNo) {
        this.evlNo = evlNo;
    }

    public String getEvlNm() {
        return evlNm;
    }

    public void setEvlNm(String evlNm) {
        this.evlNm = evlNm;
    }

    public String getGndrCd() {
        return gndrCd;
    }

    public void setGndrCd(String gndrCd) {
        this.gndrCd = gndrCd;
    }

    public String getEvlEml() {
        return evlEml;
    }

    public void setEvlEml(String evlEml) {
        this.evlEml = evlEml;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEvlTel() {
        return evlTel;
    }

    public void setEvlTel(String evlTel) {
        this.evlTel = evlTel;
    }

    public String getEvlOgdp() {
        return evlOgdp;
    }

    public void setEvlOgdp(String evlOgdp) {
        this.evlOgdp = evlOgdp;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    public String getEvlBrdt() {
        return evlBrdt;
    }

    public void setEvlBrdt(String evlBrdt) {
        this.evlBrdt = evlBrdt;
    }

    public BigDecimal getSlry() {
        return slry;
    }

    public void setSlry(BigDecimal slry) {
        this.slry = slry;
    }

    public String getEvlImg() {
        return evlImg;
    }

    public void setEvlImg(String evlImg) {
        this.evlImg = evlImg;
    }

    public String getBankNm() {
        return bankNm;
    }

    public void setBankNm(String bankNm) {
        this.bankNm = bankNm;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Timestamp getEvlCrtDt() {
        return evlCrtDt;
    }

    public void setEvlCrtDt(Timestamp evlCrtDt) {
        this.evlCrtDt = evlCrtDt;
    }

    public String getDeptCd() {
        return deptCd;
    }

    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    public String getRcrtCd() {
        return rcrtCd;
    }

    public void setRcrtCd(String rcrtCd) {
        this.rcrtCd = rcrtCd;
    }

    public String getEvlStgCd() {
        return evlStgCd;
    }

    public void setEvlStgCd(String evlStgCd) {
        this.evlStgCd = evlStgCd;
    }*/
}
