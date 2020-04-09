package com.yc.market.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.CodePointLength;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

public class SfUser implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer uid;

	@NotEmpty(message = "昵称不能为空")
	@Length(min = 5, max = 16,message="昵称长度必须为5-16位")
    private String loginname;

    private String username;

    @NotEmpty(message = "密码不能为空")
	@Length(min = 5, max = 16,message="密码长度必须为5-16位")
    private String password;

    private Integer sex;

    @NotEmpty(message = "身份证号不能为空")
    @Length(max = 18, min = 18,message="身份证格式不正确")
    private String identitycode;

    @NotEmpty(message = "邮箱不能为空")
    @Email
    private String email;
    
    @NotEmpty(message = "电话不能为空")
    @Length(max = 11, min = 11,message="电话长度必须为11位")
    private String mobile;

    private Integer utype;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdentitycode() {
        return identitycode;
    }

    public void setIdentitycode(String identitycode) {
        this.identitycode = identitycode == null ? null : identitycode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }
}