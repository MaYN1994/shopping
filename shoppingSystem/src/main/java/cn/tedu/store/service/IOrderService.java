package cn.tedu.store.service;

import cn.tedu.store.entity.Order;
import cn.tedu.store.service.ex.InsertException;

/**
 * 处理订单相关数据的业务层接口
 */
public interface IOrderService {

	/**
	 * 创建订单
	 * @param aid 收货地址的id
	 * @param cids 购物车中的数据的id
	 * @param uid 当前登录的用户的id
	 * @param username 当前登录的用户的用户名
	 * @return 成功创建的订单对象
	 * @throws InsertException
	 */
	Order create(Integer aid, Integer[] cids, 
		Integer uid, String username) 
			throws InsertException;

}




