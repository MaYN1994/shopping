package cn.tedu.store.service;

import java.util.List;

import cn.tedu.store.entity.Address;
import cn.tedu.store.service.ex.AccessDeniedException;
import cn.tedu.store.service.ex.AddressNotFoundException;
import cn.tedu.store.service.ex.DeleteException;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.UpdateException;

/**
 * 处理收货地址数据的业务层接口
 */
public interface IAddressService {

	/**
	 * 增加新的收货地址数据
	 * @param address 收货地址数据
	 * @param username 当前登录的用户的用户名
	 * @throws InsertException
	 */
	void addnew(Address address, 
		String username) 
			throws InsertException;
	
	/**
	 * 根据用户id查询该用户的收货地址数据列表
	 * @param uid 用户id
	 * @return 该用户的收货地址数据列表
	 */
	List<Address> getByUid(Integer uid);
	
	/**
	 * 根据收货地址id获取收货地址详情
	 * @param aid 收货地址id
	 * @return 匹配的收货地址详情，如果没有匹配的数据，则返回null
	 */
	Address getByAid(Integer aid);
	
	/**
	 * 将指定的收货地址设置为默认
	 * @param aid 收货地址的数据id
	 * @param uid 当前登录的用户的id
	 * @param username 当前登录的用户的用户名
	 * @throws AddressNotFoundException 
	 * @throws UpdateException
	 */
	void setDefault(
		Integer aid, Integer uid, String username) 
			throws AddressNotFoundException, 
				UpdateException, AccessDeniedException;
	
	/**
	 * 删除收货地址数据
	 * @param aid 将要删除的收货地址数据的id
	 * @param uid 当前登录的用户的id
	 * @param username 当前登录的用户的用户名
	 * @throws AddressNotFoundException
	 * @throws AccessDeniedException
	 * @throws UpdateException
	 * @throws DeleteException
	 */
	void delete(Integer aid, Integer uid, String username) 
		throws AddressNotFoundException, AccessDeniedException,
			UpdateException, DeleteException;
	
}
