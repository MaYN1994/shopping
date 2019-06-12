package cn.tedu.store.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Address;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdderssMapperTests {
	
	@Autowired
	AddressMapper addressMapper;
	
	@Test
	public void addnew() {
		Address address=new Address();
		address.setCity("456789");
		address.setDistrict("廖家腐败噢");
		address.setUid(56);
		Integer row=addressMapper.insert(address);
		System.err.println("row:"+row);
	}
	
	@Test
	public void countByUid() {
		Integer uid=56;
		Integer count=addressMapper.countByUid(uid);
		System.err.println("count:"+count);
	}
	
	@Test
	public void findByUid() {
		Integer uid=14;
		List<Address> list=addressMapper.findByUid(uid);
		for (Address item : list) {
			System.err.println(item);
		}
	}
	
	
	
	@Test
	public void UpdateNonDefault() {
		Integer uid=14;
		Integer row=addressMapper.updateNonDefault(uid);
		System.err.println("row:"+row);
	}
	
	@Test
	public void UpdateDefault() {
		Integer aid=15;
		String modifiedUser="wly";
		Date modifiedTime=new Date();
		Integer row=addressMapper.updateDefault(aid, modifiedUser, modifiedTime);
		System.err.println("row:"+row);
	}
	
	@Test
	public void findByAid() {
		Integer aid=15;
		Address address=addressMapper.findByAid(aid);
		System.err.println(address);
		
	}
	
	@Test
	public void deleteByAid() {
		Integer aid=24;
		Integer row=addressMapper.deleteByAid(aid);
		System.err.println("row:"+row);
	}
	
	@Test
	public void findLastAddress() {
		Integer uid=14;
		Address data=addressMapper.findLastModified(uid);
		System.err.println(data);
	
	}
}
