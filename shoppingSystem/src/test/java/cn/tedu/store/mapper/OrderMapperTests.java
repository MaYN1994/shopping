package cn.tedu.store.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Order;
import cn.tedu.store.entity.OrderItem;
import cn.tedu.store.vo.OrderVO;



@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTests {
	@Autowired
	OrderMapper orderMapper;
	
	@Test
	public void insertOrder() {
		Order order=new Order();
		order.setRecvAddress("address");
		order.setRecvName("wly");
		orderMapper.insertOrder(order);
		System.err.println("OK");
	}
	
	@Test
	public void insertOrderItem() {
		OrderItem orderItem=new OrderItem();
		orderItem.setGid(25L);
		orderItem.setCreatedUser("i");
		orderMapper.insertOrderItem(orderItem);
		System.err.println("OK");
	}
	
//	@Test
//	public void findByOid() {
//		Integer oid=6;
//		OrderVO result=orderMapper.findByOid(oid);
//		System.err.println(result);
//	}
	
}
