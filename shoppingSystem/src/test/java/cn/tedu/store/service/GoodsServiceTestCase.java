package cn.tedu.store.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Goods;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceTestCase {

	@Autowired
	IGoodsService service;
	
	@Test
	public void getByUid() {
		List<Goods> list = service.getHotList();
		System.err.println("BEGIN:");
		for (Goods item : list) {
			System.err.println(item);
		}
		System.err.println("END.");
	}
	
	@Test
	public void findById() {
		Long id = 1000001700000L;
		Goods data = service.getById(id);
		System.err.println(data);
	}
	
}










