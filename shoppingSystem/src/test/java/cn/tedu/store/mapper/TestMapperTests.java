package cn.tedu.store.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Car;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTests {

	@Autowired
	PoiMapper mapper;
	
	@Test
	public void addnew() {
		Car car=new Car();
		car.setCartype("瑞风S3");
		car.setEngineNum("e01");
		car.setEngineType("ee01");
		car.setVIN("2019798764");
		car.setChassisNum("J01");
		car.setProduceTime(new Date());
		Integer row=mapper.addnew(car);
		System.err.println("row:"+row);
	}

}
