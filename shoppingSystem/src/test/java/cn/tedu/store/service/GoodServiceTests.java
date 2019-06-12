package cn.tedu.store.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Good;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodServiceTests {
	
	@Autowired
	IGoodService goodService;
	
	@Test
	public void getHotList() {
		List<Good> list=goodService.getHotList();
		System.err.println("BEGIN");
		for (Good item : list) {
			System.err.println(item);
		}
		System.err.println("END");
	}
	
	@Test
	public void getById() {		
		Long id=10000023L;
		Good item=goodService.getById(id);
		System.err.println(item);
	}
}
