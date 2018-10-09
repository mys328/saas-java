package com.hq.storeMS.service.buser.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.Table;

import com.hq.storeMS.common.constants.ServerConstants;
import com.hq.storeMS.service.common.EntityState;
import com.zenmind.dao.classinfo.IndexField;
import com.zenmind.dataSyn.annotation.SynClass;
import com.zenmind.dataSyn.annotation.SynIgnoreField;

@SynClass
@Table(name = "buser")
public class BUser {

	@Id
	private long id;

	// 系统生成的内部账号
	@IndexField(groupName = "priAccountNum")
	private String priAccountNum;

	// 微信用户统一标识
	@IndexField(groupName = "wxUnionId")
	private String wxUnionId;

	private String name;
	// 手机号码区号
	private String areaCode = "";

	@IndexField(groupName = "phone")
	private long phone;

	@SynIgnoreField
	private String password;

	private String headImg;

	private int gender;

	private int age;

	// 给密码加点盐
	@SynIgnoreField
	private String salt;

	// 用户关联的店铺id列表
	private Set<Long> storeIdSet = new HashSet<Long>();
	// 用户关联的连锁店id列表
	private Set<Long> chainIds = new HashSet<Long>();
	// 来源 对应 BuserOriginEnum
	private int origin;

	// 用户绑定的仪器id
	private long buserDeviceId;

	private long createdTime;

	private long lastUpdateTime;

	private long ver;

	private EntityState state = EntityState.Normal;

	// 角色idset 对应 BuserRoleEnum
	private Set<Integer> roleSet = new HashSet<Integer>();
	// 会员类型 对应 StoreVipType 中的level 参考 StoreVipLevelEnum 初始状态为体验会员
	private long vipType;
	// 会员到期时间
	private long expiredTime;
	// 商务手机
	private long businessPhone;

	public static BUser newInstance() {
		BUser buser = new BUser();
		buser.businessPhone = ServerConstants.BUSINESS_PHONE;

		long curTime = System.currentTimeMillis();

		buser.createdTime = curTime;
		buser.lastUpdateTime = curTime;

		return buser;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void addStoreId(long storeId) {
		this.storeIdSet.add(storeId);
	}

	public void removeStoreId(long storeId) {
		this.storeIdSet.remove(storeId);
	}

	public Set<Long> getStoreIdSet() {
		return storeIdSet;
	}

	public void setStoreIdSet(Set<Long> storeIdSet) {
		this.storeIdSet = storeIdSet;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public long getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public long getVer() {
		return ver;
	}

	public void setVer(long ver) {
		this.ver = ver;
	}

	public void incrVer() {
		this.ver = ver + 1;
	}

	public EntityState getState() {
		return state;
	}

	public void setState(EntityState state) {
		this.state = state;
	}

	public String getCredentialsSalt() {
		return this.priAccountNum + this.salt;
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

	public void addRoleSet(int roleEnum) {
		this.roleSet.add(roleEnum);
	}

	public long getVipType() {
		return vipType;
	}

	public void setVipType(long vipType) {
		this.vipType = vipType;
	}

	public long getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(long expiredTime) {
		this.expiredTime = expiredTime;
	}

	public void rechargeExpiredTime(long rechargeTimeMillis) {
		this.expiredTime += rechargeTimeMillis;
	}

	public long getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(long businessPhone) {
		this.businessPhone = businessPhone;
	}

	public long getBuserDeviceId() {
		return buserDeviceId;
	}

	public void setBuserDeviceId(long buserDeviceId) {
		this.buserDeviceId = buserDeviceId;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Set<Long> getChainIds() {
		return chainIds;
	}

	public void setChainIds(Set<Long> chainIds) {
		this.chainIds = chainIds;
	}

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public String getPriAccountNum() {
		return priAccountNum;
	}

	public void setPriAccountNum(String priAccountNum) {
		this.priAccountNum = priAccountNum;
	}

	public String getWxUnionId() {
		return wxUnionId;
	}

	public void setWxUnionId(String wxUnionId) {
		this.wxUnionId = wxUnionId;
	}
}
