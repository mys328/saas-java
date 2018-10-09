package com.hq.storeMS.service.leaguerAffair.apiData;

import com.hq.storeMS.service.leaguerAffair.data.AlarmClock;
import com.zenmind.common.beanCopy.FastBeanCopyer;

public class AddAlarmClock {
	private long id;
	
	private String title;
	private String content;
	private long beauticianId;
	private String beauticianName;
	private int hours;

	public static AddAlarmClock newInstance() {
		return new AddAlarmClock();
	}
	
	public AlarmClock toAlarmClock(){
		AlarmClock data = AlarmClock.newInstance();
		FastBeanCopyer.getInstance().copy(this, data);
		return data;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getBeauticianId() {
		return beauticianId;
	}

	public void setBeauticianId(long beauticianId) {
		this.beauticianId = beauticianId;
	}

	public String getBeauticianName() {
		return beauticianName;
	}

	public void setBeauticianName(String beauticianName) {
		this.beauticianName = beauticianName;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
