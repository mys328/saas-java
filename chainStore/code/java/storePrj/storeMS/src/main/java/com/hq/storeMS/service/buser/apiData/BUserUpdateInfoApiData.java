package com.hq.storeMS.service.buser.apiData;

import java.util.HashSet;
import java.util.Set;

import com.hq.storeMS.service.buser.data.BUser;
import com.hq.storeMS.service.common.GenderEnum;
import com.zenmind.common.beanCopy.FastBeanCopyer;

public class BUserUpdateInfoApiData {

	private long buserId;

	private String name;

	private String headImg;

	private int gender;

	private int age;

	// 角色这个字段，已经不使用，在BUserAddApiForm里面，注册的时候已经确定了角色 而且注册后不能再修改。
	private Set<Integer> roleSet = new HashSet<Integer>();

	public static BUserUpdateInfoApiData newInstance() {
		return new BUserUpdateInfoApiData();
	}

	public long getBuserId() {
		return buserId;
	}

	public void setBuserId(long buserId) {
		this.buserId = buserId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void update(BUser buser) {
		FastBeanCopyer.getInstance().copy(this, buser);
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public GenderEnum getGenderEnum() {
		return GenderEnum.valueOf(gender);
	}

	public void setGenderEnum(GenderEnum gender) {
		this.gender = gender.ordinal();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Integer> getRoleSet() {
		return roleSet;
	}

	public void setRoleSet(Set<Integer> roleSet) {
		this.roleSet = roleSet;
	}

}
