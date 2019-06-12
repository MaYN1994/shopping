package cn.tedu.store.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Good;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodMapperTests {
	
	@Autowired
	GoodMapper goodMapper;
	
	@Test
	public void findHotList() {
		List<Good> list =goodMapper.findHotList();
		System.err.println("BEGIN");
		for (Good item : list) {
			System.err.println(item);
		}
		System.err.println("END");
	}
	
	@Test
	public void findById() {
		Long id=10000020L;
		Good data =goodMapper.findById(id);
		System.err.println(data);
	}
}
