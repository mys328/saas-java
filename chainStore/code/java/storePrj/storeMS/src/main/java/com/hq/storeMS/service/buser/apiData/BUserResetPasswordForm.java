package com.hq.storeMS.service.buser.apiData;

public class BUserResetPasswordForm {

	public static BUserResetPasswordForm newInstance() {
		return new BUserResetPasswordForm();
	}

	private long phone;

	private String password;

	private String verifyCode;// 验证码

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
