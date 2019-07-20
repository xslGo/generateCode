package com.wah.kitty.labour.model;

import java.math.BigDecimal;

public class LabourJob {
    private Integer id;

    private String jName;

    private String jAbilitydesc;

    private BigDecimal jDailywage;

    private String jLogourl;

    private String jAbilitytag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName == null ? null : jName.trim();
    }

    public String getjAbilitydesc() {
        return jAbilitydesc;
    }

    public void setjAbilitydesc(String jAbilitydesc) {
        this.jAbilitydesc = jAbilitydesc == null ? null : jAbilitydesc.trim();
    }

    public BigDecimal getjDailywage() {
        return jDailywage;
    }

    public void setjDailywage(BigDecimal jDailywage) {
        this.jDailywage = jDailywage;
    }

    public String getjLogourl() {
        return jLogourl;
    }

    public void setjLogourl(String jLogourl) {
        this.jLogourl = jLogourl == null ? null : jLogourl.trim();
    }

    public String getjAbilitytag() {
        return jAbilitytag;
    }

    public void setjAbilitytag(String jAbilitytag) {
        this.jAbilitytag = jAbilitytag == null ? null : jAbilitytag.trim();
    }
}