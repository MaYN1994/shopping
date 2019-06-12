package cn.tedu.store.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.District;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistrictMapperTests {
	
	@Autowired
	private DistrictMapper districtMapper;
	
	@Test
	public void findByParent(){
		List<District> list=districtMapper.findByParent("86");
		for (District item : list) {
			System.err.println(item);
		}
	}
	
	@Test
	public void findByCode(){
		String code="210000";
		District district=districtMapper.findByCode(code);
		System.err.println(district);
	}

}
