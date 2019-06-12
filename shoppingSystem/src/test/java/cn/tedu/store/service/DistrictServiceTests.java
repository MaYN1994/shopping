package cn.tedu.store.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.District;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistrictServiceTests {

	@Autowired
	private IDistrictService districtService;

	@Test
	public void getByParent() {
		List<District> list=districtService.getByParent("86");
		for (District item : list) {
			System.err.println(item);
		}
	}
	
	@Test
	public void getByCode() {
		String code="210000";
		District list=districtService.getByCode(code);
		System.err.println(list);
	}
	
}
