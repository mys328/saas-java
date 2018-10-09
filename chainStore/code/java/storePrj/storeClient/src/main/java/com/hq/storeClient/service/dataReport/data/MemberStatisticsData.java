package com.hq.storeClient.service.dataReport.data;

import com.zenmind.dataSyn.annotation.SynClass;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description 会员统计数据
 * @Creator geefox
 * @E-mail firstblh@163.com
 * @Date 2018/8/3
 */
@SynClass
public class MemberStatisticsData {

    private long storeId;//店铺ID

    //会员总数数
    private int totalMembershipCount;

    //同期新增会员人数
    private int newMembershipCount;

    //指定时间内的会员消费次数
    private int totalConsumptionTimes;

    //散客消费次数
    private int outSiderConsumptionTimes;

    //消费排行
    private List<MemberConsumptionData> consumptionList = new ArrayList<>();
    //时间段内的每日数据统计
    private List<DayData> dayDataList = new ArrayList<>();

    private List<LeaguerOriginData> leaguerOriginDatas = new ArrayList<>();

    /**
     * 时间段内每日新增会员数据统计 包括消费金额、消费次数
     * 新增会员消费统计 amount
     * 新增会员消费频次 count
     */
    private List<DayData> newMemberCostDataList = new ArrayList<>();

    //新增会员频次
    private List<DayData> newMemberAddDataList = new ArrayList<>();

    private MemberStatisticsData() {

    }

    public static MemberStatisticsData newInstance() {
        return new MemberStatisticsData();
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public int getTotalMembershipCount() {
        return totalMembershipCount;
    }

    public void setTotalMembershipCount(int totalMembershipCount) {
        this.totalMembershipCount = totalMembershipCount;
    }

    public int getTotalConsumptionTimes() {
        return totalConsumptionTimes;
    }

    public void setTotalConsumptionTimes(int totalConsumptionTimes) {
        this.totalConsumptionTimes = totalConsumptionTimes;
    }

    public int getOutSiderConsumptionTimes() {
        return outSiderConsumptionTimes;
    }

    public void setOutSiderConsumptionTimes(int outSiderConsumptionTimes) {
        this.outSiderConsumptionTimes = outSiderConsumptionTimes;
    }


    public List<MemberConsumptionData> getConsumptionList() {
        return consumptionList;
    }

    public void setConsumptionList(List<MemberConsumptionData> consumptionList) {
        this.consumptionList = consumptionList;
    }

    public List<DayData> getDayDataList() {
        return dayDataList;
    }

    public void setDayDataList(List<DayData> dayDataList) {
        this.dayDataList = dayDataList;
    }

    public List<LeaguerOriginData> getLeaguerOriginDatas() {
        return leaguerOriginDatas;
    }

    public void setLeaguerOriginDatas(List<LeaguerOriginData> leaguerOriginDatas) {
        this.leaguerOriginDatas = leaguerOriginDatas;
    }

    public int getNewMembershipCount() {
        return newMembershipCount;
    }

    public void setNewMembershipCount(int newMembershipCount) {
        this.newMembershipCount = newMembershipCount;
    }

    public List<DayData> getNewMemberCostDataList() {
        return newMemberCostDataList;
    }

    public void setNewMemberCostDataList(List<DayData> newMemberCostDataList) {
        this.newMemberCostDataList = newMemberCostDataList;
    }

    public List<DayData> getNewMemberAddDataList() {
        return newMemberAddDataList;
    }

    public void setNewMemberAddDataList(List<DayData> newMemberAddDataList) {
        this.newMemberAddDataList = newMemberAddDataList;
    }

    /**
     * 增加会员消费次数
     *
     * @param times
     */
    public void addTotalConsumptionTimes(int times) {
        this.totalConsumptionTimes += times;
    }

    /**
     * 增加散客消费次数
     *
     * @param times
     */
    public void addOutSiderConsumptionTimes(int times) {
        this.outSiderConsumptionTimes += times;
    }

    /**
     * 增加新增会员数
     *
     * @param count
     */
    public void addNewMembershipCount(int count) {
        this.newMembershipCount += count;
    }

    /**
     * notice 仅供两个时间段为一致的对象使用
     */
    public void add(MemberStatisticsData target) {
        if (null == target) return;

        //会员总数数
        this.totalMembershipCount += target.getTotalMembershipCount();

        //同期新增会员人数
        this.newMembershipCount += target.getNewMembershipCount();

        //指定时间内的会员消费次数
        this.totalConsumptionTimes += target.getTotalConsumptionTimes();

        //散客消费次数
        this.outSiderConsumptionTimes += target.getOutSiderConsumptionTimes();

        //消费排行
        this.consumptionList.addAll(target.getConsumptionList());

        for (int i = 0; i < dayDataList.size(); i++) {
            //每日数据统计
            dayDataList.get(i).addAmount(target.getDayDataList().get(i).getAmount());
            dayDataList.get(i).addCount(target.getDayDataList().get(i).getCount());

            newMemberCostDataList.get(i).addAmount(target.getNewMemberCostDataList().get(i).getAmount());
            newMemberCostDataList.get(i).addCount(target.getNewMemberCostDataList().get(i).getCount());

            newMemberAddDataList.get(i).addAmount(target.getNewMemberAddDataList().get(i).getAmount());
            newMemberAddDataList.get(i).addCount(target.getNewMemberAddDataList().get(i).getCount());
        }
        List<LeaguerOriginData> tempOriginDatas = new ArrayList<>();
        for (LeaguerOriginData leaguerOriginDataT : target.getLeaguerOriginDatas()) {
            boolean hasSame = false;
            for (LeaguerOriginData leaguerOriginData : leaguerOriginDatas) {
                if (leaguerOriginData.getOriginName().equals(leaguerOriginDataT.getOriginName())) {
                    hasSame = true;
                    leaguerOriginData.addCount(leaguerOriginDataT.getCount());
                    break;
                }
            }
            if (!hasSame) {
                tempOriginDatas.add(leaguerOriginDataT);
            }
        }
        if (tempOriginDatas.size() > 0) {
            leaguerOriginDatas.addAll(tempOriginDatas);
        }

    }

}
