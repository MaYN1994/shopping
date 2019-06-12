package cn.tedu.store.mapper;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Cart;
import cn.tedu.store.vo.CartVO;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CartMapperTests {
	
	@Autowired
	CartMapper mapper;
	
	@Test
	public void addnew() {
		Cart cart=new Cart();
		cart.setGid(20012001L);
		cart.setUid(14);
		cart.setCreatedUser("user");
		cart.setCreatedTime(new Date());
		cart.setNum(1);
		Integer row=mapper.addnew(cart);
		System.err.println("row:"+row);
	}
	
	@Test
	public void updateNum() {
		Date modifiedTime=new Date();
		String modifiedUser="newUser";
		Integer num=5;
		Integer cid=1;
		Integer row=mapper.updateNum(cid, num, modifiedUser, modifiedTime);
		System.err.println("row:"+row);
	}
	
	@Test
	public void findByUidAndGid() {
		Integer uid=14;
		Long gid=20012001L;
		Cart data=mapper.findByUidAndGid(uid, gid);
		System.err.println("cart:"+data);
	}
	
	@Test
	public void findByUid() {
		List<CartVO> list=mapper.findByUid(14);
		System.err.println(list.size());
		for (CartVO item : list) {
			System.err.println(item);
		}
	}
	
	@Test
	public void findByCid() {
		Integer cid=3;
		Cart cart=mapper.findByCid(cid);
		System.err.println(cart);
	}
	
	@Test
	public void findByCids() {
		Integer[] cids= {2,3,4};
		List<CartVO> list=mapper.findByCids(cids);
		for (CartVO item : list) {
			System.err.println(item);
		}
	}

}
