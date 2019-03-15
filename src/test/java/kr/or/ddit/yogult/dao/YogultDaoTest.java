package kr.or.ddit.yogult.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.yogult.dao.IYogultDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:kr/or/ddit/config/spring/context-batch.xml")
public class YogultDaoTest {
	
	
	@Resource(name="yogultDao")
	private IYogultDao yogultDao;
	
	
	/**
	* Method : testdailyBatchYm
	* 작성자 : PC09
	* 변경이력 :
	* Method 설명 : 일실적 생성 테스트
	*/
	@Test
	public void testdailyBatchYm() {
		
		/***Given***/
		String ym = "201904";
		yogultDao.deleteDailyYm(ym);
		
		
		/***When***/
		int insertCnt = yogultDao.dailyBatchYm(ym);
		

		/***Then***/
		assertTrue(insertCnt > 50);
		
		
		
		
		
	}

}