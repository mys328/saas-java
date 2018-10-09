package com.hq.chainStore.pressTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomUtils;

import com.hq.chainStore.pressTest.common.PressRecorder;
import com.hq.chainStore.pressTest.common.ThreadRecorder;
import com.hq.chainStore.pressTest.storeActor.BossActor;
import com.hq.chainStore.pressTest.storeCreate.StoreCreator;
import com.hq.testClass.robot.buser.Boss;
import com.hq.testClass.robot.buser.robot.BRobot;
import com.zenmind.common.asynExecutor.AsynExecutor;
import com.zenmind.common.asynExecutor.IntfAsynTask;
import com.zenmind.common.asynExecutor.IntfErrorHandler;

public class StoreRunnerQuery {
	private ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
	private AsynExecutor<String> asynExecutor;
	private BossActor bossActor;
	
	private long[] phones={13800041327L,13800037772L,13800095549L,13800047544L,13800025592L,13800039642L,13800042855L,13800047697L,13800029538L,13800052414L,13800091894L,13800014435L,13800012937L,13800067534L,13800066707L,13800026373L,13800087380L,13800045816L,13800070937L,13800076908L,13800089617L,13800095963L,13800076041L,13800089332L,13800094292L,13800079740L,13800062354L,13800040297L,13800006901L,13800074844L,13800057122L,13800008487L,13800026667L,13800095374L,13800054901L,13800052870L,13800042385L,13800015661L,13800075040L,13800032506L,13800062620L,13800037011L,13800067265L,13800025694L,13800088830L,13800021998L,13800019439L,13800080345L,13800033091L,13800043124L,13800057986L,13800056609L,13800001134L,13800060413L,13800073734L,13800023139L,13800025944L,13800054425L,13800088617L,13800083373L,13800064749L,13800052704L,13800093702L,13800082603L,13800056011L,13800067214L,13800012276L,13800056437L,13800000224L,13800027065L,13800071416L,13800054931L,13800067624L,13800020898L,13800062252L,13800025470L,13800027624L,13800036560L,13800016881L,13800005711L,13800006803L,13800041699L,13800077600L,13800065214L,13800033439L,13800056045L,13800040049L,13800001224L,13800090539L,13800044420L,13800085613L,13800099548L,13800083064L,13800097788L,13800021854L,13800020183L,13800013578L,13800003673L,13800019992L,13800015987L,13800035970L,13800063976L,13800046476L,13800080967L,13800049346L,13800091862L,13800037041L,13800042735L,13800068484L,13800073057L,13800016854L,13800055348L,13800014848L,13800084211L,13800082480L,13800033423L,13800009537L,13800005975L,13800019973L,13800012495L,13800004651L,13800053163L,13800081946L,13800058178L,13800073524L,13800039357L,13800076359L,13800010136L,13800088548L,13800031321L,13800025948L,13800057003L,13800070035L,13800051623L,13800026199L,13800001218L,13800089158L,13800024379L,13800061165L,13800059325L,13800054862L,13800058381L,13800072922L,13800030228L,13800081862L,13800008880L,13800016430L,13800002656L,13800040975L,13800050854L,13800015998L,13800073123L,13800046738L,13800032794L,13800023916L,13800031851L,13800027739L,13800093167L,13800059228L,13800080729L,13800051157L,13800052284L,13800065851L,13800053096L,13800003246L,13800082850L,13800057589L,13800027506L,13800058064L,13800063677L,13800060732L,13800002452L,13800021985L,13800097856L,13800067927L,13800008762L,13800095393L,13800046884L,13800018582L,13800061949L,13800046150L,13800024264L,13800009593L,13800091632L,13800004638L,13800014107L,13800089663L,13800013059L,13800075753L,13800010845L,13800014937L,13800079527L,13800036025L,13800044174L,13800074803L,13800036472L,13800039376L,13800088037L,13800014179L,13800079968L,13800079517L,13800020521L,13800011193L,13800075552L,13800076442L,13800048741L,13800030060L,13800022066L,13800005069L,13800014845L,13800017572L,13800087410L,13800094434L,13800009063L,13800015281L,13800015203L,13800036490L,13800023484L,13800025103L,13800092630L,13800018556L,13800067540L,13800097147L,13800013869L,13800083341L,13800020665L,13800050622L,13800025573L,13800029877L,13800020731L,13800055677L,13800051771L,13800073127L,13800016650L,13800066530L,13800043501L,13800076981L,13800048521L,13800031122L,13800045897L,13800092359L,13800000806L,13800032340L,13800080779L,13800097823L,13800073135L,13800012290L,13800053736L,13800058003L,13800061320L,13800014551L,13800029168L,13800072654L,13800035329L,13800050493L,13800088056L,13800056459L,13800080075L,13800083705L,13800048221L,13800046168L,13800080689L,13800085469L,13800062412L,13800097196L,13800039052L,13800052210L,13800070631L,13800041997L,13800086968L,13800065447L,13800024043L,13800096778L,13800030828L,13800095586L,13800065269L,13800079352L,13800087982L,13800057865L,13800037962L,13800043155L,13800071212L,13800009621L,13800076477L,13800005019L,13800096781L,13800081980L,13800082835L,13800035601L,13800096335L,13800042401L,13800014635L,13800072246L,13800052627L,13800080513L,13800094306L,13800021191L,13800077596L,13800059972L,13800098651L,13800009183L,13800067582L,13800031142L,13800042979L,13800027154L,13800090714L,13800014665L,13800078618L,13800038089L,13800075758L,13800063681L,13800018838L,13800096520L,13800003346L,13800039971L,13800085641L,13800047393L,13800073223L,13800000275L,13800082539L,13800000538L,13800047025L,13800023024L,13800053243L,13800026730L,13800016973L,13800082597L,13800081479L,13800066228L,13800071493L,13800040982L,13800042771L,13800019975L,13800045511L,13800020908L,13800052446L,13800062043L,13800083068L,13800058919L,13800037895L,13800056304L,13800006461L,13800052039L,13800055703L,13800010092L,13800017704L,13800067871L,13800034272L,13800082713L,13800047866L,13800008126L,13800044524L,13800093154L,13800002046L,13800006339L,13800080025L,13800085106L,13800090795L,13800061988L,13800063303L,13800057263L,13800041011L,13800068098L,13800011388L,13800072512L,13800052958L,13800035316L,13800088231L,13800022625L,13800053950L,13800082550L,13800037993L,13800023335L,13800039908L,13800075158L,13800091001L,13800059037L,13800032409L,13800090019L,13800093935L,13800063746L,13800034449L,13800064570L,13800067200L,13800032518L,13800098401L,13800076790L,13800079696L,13800051527L,13800008024L,13800095290L,13800026831L,13800025045L,13800093426L,13800076389L,13800027618L,13800019527L,13800072144L,13800022011L,13800057226L,13800063680L,13800022156L,13800039348L,13800021866L,13800099755L,13800050578L,13800014251L,13800064714L,13800043574L,13800060946L,13800048588L,13800026624L,13800001942L,13800022521L,13800083906L,13800029302L,13800062656L,13800059270L,13800082788L,13800038670L,13800098120L,13800048097L,13800032036L,13800044971L,13800039905L,13800063279L,13800025596L,13800074385L,13800080024L,13800091977L,13800000892L,13800075637L,13800022581L,13800094451L,13800069435L,13800015287L,13800096343L,13800031826L,13800043585L,13800002771L,13800073555L,13800078174L,13800026006L,13800086720L,13800021202L,13800006590L,13800002579L,13800049752L,13800085550L,13800082842L,13800094347L,13800004318L,13800099119L,13800052946L,13800020765L,13800088806L,13800077070L,13800045109L,13800024481L,13800055830L,13800099662L,13800095925L,13800002643L,13800051217L,13800002714L,13800016126L,13800025032L,13800000637L,13800078888L,13800032015L,13800056084L,13800055875L,13800017425L,13800026153L,13800047069L,13800015515L,13800083762L,13800053547L,13800019304L,13800051474L,13800024938L,13800057191L,13800016230L,13800097900L,13800052633L,13800006870L,13800029506L,13800017516L,13800060986L,13800076848L,13800058897L,13800036987L,13800090342L,13800035487L,13800075005L,13800020557L,13800031277L,13800060346L,13800002839L,13800040742L};
	
	public static StoreRunnerQuery newInstance(int i) throws InterruptedException{
		StoreRunnerQuery runner = new StoreRunnerQuery();
		runner.bossActor = BossActor.newInstance(runner.createBossByPhone(i));
		runner.initExecutor();
		runner.init();
		return runner; 
	}
	
	private Boss createBossByPhone(int i){
		Boss boss = Boss.newBoss(BRobot.newRandom());
		boss.getRobot().getData().setPhone(phones[i]);
		boss.getRobot().getData().setPassword("123456");
		boss.login();
		boss.setStoreId(boss.getRobot().getData().getStoreIds().get(0));
		return boss;
	}
	
	private void init(){
		ses.scheduleAtFixedRate(new Runnable() {
			public void run() {
				try {
					asynExecutor.addData("driveRun"+RandomUtils.nextInt(0, 65535));
				} catch (Throwable e) {
					e.printStackTrace();
				}
				
			}
		}, RandomUtils.nextLong(10, 60), 5, TimeUnit.SECONDS);
	}
	
	private void initExecutor(){
		IntfAsynTask<String> asynTaskP = new IntfAsynTask<String>() {
			@Override
			public void doTask(String target) {
				bossActor.doAction();
			}
		};
		IntfErrorHandler<String> errorHandlerP = new IntfErrorHandler<String>() {
			@Override
			public void handle(String target, String msg, Throwable e) {
				PressRecorder.logError( msg, e);
			}
		};
		int queueSizeP = 65535;
		int threadCountP = 6;
		asynExecutor = AsynExecutor.newInstance(asynTaskP, errorHandlerP, queueSizeP , threadCountP);
		asynExecutor.init();
	}
	
	public static void main(String[] args) throws InterruptedException {
		StoreCreator.initEnv();
		int count = 0 ;
		for (int i = 0; i < 200; i++) {
			try {
				StoreRunnerQuery.newInstance(i);
			} catch (Exception e) {
				count++;
				e.printStackTrace();
			}
			System.out.println("----------------"+i+"----------------");
		}
		System.out.println("===============count="+count+" thread is dead");
		PressRecorder.reset();
		while (true) {
			Thread.sleep(1000);
			System.out.println(PressRecorder.getInfo() + " | " +ThreadRecorder.getInfo() + " | tps:"+PressRecorder.countTps());
		}
	}
}
