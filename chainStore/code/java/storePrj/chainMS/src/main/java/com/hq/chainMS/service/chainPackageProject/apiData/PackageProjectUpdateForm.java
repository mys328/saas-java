package com.hq.chainMS.service.chainPackageProject.apiData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hq.chainMS.service.chainPackageProject.data.PackageItem;
import com.hq.chainMS.service.chainPackageProject.data.PackageProject;
import com.hq.chainMS.service.chainPackageProject.data.PackageProjectDetail;
import com.zenmind.common.beanCopy.FastBeanCopyer;

public class PackageProjectUpdateForm {
	private String id;
	// 编号
	private String number;
	// 名称
	private String name;
	// 分类Id
	private String typeId;
	// 状态 对应PackageStateEnum
	private int state;
	// 售价
	private float sellPrice;
	// 成本
	private float cost;
	// 默认图片
	private String defaultImg;
	// 描述
	private String descript;
	// 图片列表
	private List<String> imgPaths = new ArrayList<String>();
	// 套餐内容
	private List<PackageItem> packageItems = new ArrayList<PackageItem>();
	// 适用门店
	private Set<Long> applyStoreIds = new HashSet<Long>();

	public static PackageProjectUpdateForm newInstance() {
		return new PackageProjectUpdateForm();
	}

	public void updatePackageProject(PackageProject data) {
		FastBeanCopyer.getInstance().copy(this, data);
	}

	public void updatePackageProjectDetail(PackageProjectDetail data) {
		FastBeanCopyer.getInstance().copy(this, data);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public float getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getDefaultImg() {
		return defaultImg;
	}

	public void setDefaultImg(String defaultImg) {
		this.defaultImg = defaultImg;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public List<String> getImgPaths() {
		return imgPaths;
	}

	public void setImgPaths(List<String> imgPaths) {
		this.imgPaths = imgPaths;
	}

	public List<PackageItem> getPackageItems() {
		return packageItems;
	}

	public void setPackageItems(List<PackageItem> packageItems) {
		this.packageItems = packageItems;
	}

	public Set<Long> getApplyStoreIds() {
		return applyStoreIds;
	}

	public void setApplyStoreIds(Set<Long> applyStoreIds) {
		this.applyStoreIds = applyStoreIds;
	}

}
