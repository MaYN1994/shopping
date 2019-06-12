package cn.tedu.store.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Order;
import cn.tedu.store.service.ex.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTestCase {
	
	@Autowired
	IOrderService service;
	
	@Test
	public void create() {
		try {
			Integer aid = 13;
			Integer[] cids = {6,3,5};
			Integer uid = 11;
			String username = "超级管理员";
			Order order = service.create(aid, cids, uid, username);
			System.err.println(order);
		} catch (ServiceException e) {
			System.err.println(e.getClass().getName());
			System.err.println(e.getMessage());
		}
	}
	
}







