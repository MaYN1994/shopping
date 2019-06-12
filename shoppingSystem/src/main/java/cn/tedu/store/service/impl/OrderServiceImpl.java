package cn.tedu.store.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.tedu.store.entity.Address;
import cn.tedu.store.entity.Order;
import cn.tedu.store.entity.OrderItem;
import cn.tedu.store.mapper.OrderMapper;
import cn.tedu.store.service.IAddressService;
import cn.tedu.store.service.ICartService;
import cn.tedu.store.service.IOrderService;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.vo.CartVO;

/**
 * 处理订单相关数据的业务层实现类
 */
@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private IAddressService addressService;
	@Autowired
	private ICartService cartService;

	@Override
	@Transactional
	public Order create(Integer aid, Integer[] cids, Integer uid, String username) throws InsertException {
		// 创建当前时间对象：Date now = new Date();
		Date now = new Date();

		// 定义总价变量totalPrice = 0
		Long totalPrice = 0L;
		// 基于参数cids查询得到List<CartVO>：cartService.getByCids(cids)
		List<CartVO> carts = cartService.getByCids(cids);
		// 遍历集合
		for (CartVO cart : carts) {
			// 遍历过程中基于商品单价和数量，得到该样商品的总价，并累加到totalPrice
			totalPrice += cart.getPrice() * cart.getNum();
		}

		// 创建对象：Order order = new Order();
		Order order = new Order();
		// 封装order属性：基于参数uid
		order.setUid(uid);
		// 封装order属性：基于aid查询得到3个收货相关数据：addressService.getByAid(aid)
		Address address = addressService.getByAid(aid);
		order.setRecvName(address.getName());
		order.setRecvPhone(address.getPhone());
		order.setRecvAddress(address.getDistrict() + address.getAddress());
		// 封装order属性：total_price
		order.setTotalPrice(totalPrice);
		// 封装order属性：status -> 0
		order.setStatus(0);
		// 封装order属性：order_time -> now
		order.setOrderTime(now);
		// 封装order属性：基于参数username和now封装4项日志
		order.setCreatedUser(username);
		order.setCreatedTime(now);
		order.setModifiedUser(username);
		order.setModifiedTime(now);
		// 插入订单数据：insertOrder(order);
		insertOrder(order);

		// 遍历List<CartVO>
		for (CartVO cart : carts) {
			// 创建订单商品数据：OrderItem orderItem = new OrderItem();
			OrderItem item = new OrderItem();
			// 封装orderItem属性：oid -> order.getOid();
			item.setOid(order.getOid());
			// 封装orderItem属性：基于遍历到的对象，封装商品相关数据
			item.setGid(cart.getGid());
			item.setGoodsImage(cart.getImage());
			item.setGoodsNum(cart.getNum());
			item.setGoodsPrice(cart.getPrice());
			item.setGoodsTitle(cart.getTitle());
			// 封装orderItem属性：基于参数username和now封装4项日志
			item.setCreatedUser(username);
			item.setCreatedTime(now);
			item.setModifiedUser(username);
			item.setModifiedTime(now);
			// 循环插入订单商品数据：insertOrderItem(orderItem)
			insertOrderItem(item);
		}
		return order;
	}
	
	/**
	 * 插入订单数据
	 * @param order 订单数据
	 */
	private void insertOrder(Order order) {
		Integer rows = orderMapper.insertOrder(order);
		if (rows != 1) {
			throw new InsertException(
				"创建订单失败！插入订单数据时出现未知错误！");
		}
	}

	/**
	 * 插入订单商品数据
	 * @param orderItem 订单商品数据
	 */
	private void insertOrderItem(OrderItem orderItem) {
		Integer rows = orderMapper.insertOrderItem(orderItem);
		if (rows != 1) {
			throw new InsertException(
				"创建订单失败！插入订单商品数据时出现未知错误！");
		}
	}

}
