package com.hq.customerRestClient.service.cuser.apiData;

public class CUserResetPasswordForm {
	private long phone;

	private String password;
	
	private String verifyCode;//验证码

	public static CUserResetPasswordForm newInstance() {
		return new CUserResetPasswordForm();
	}

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
