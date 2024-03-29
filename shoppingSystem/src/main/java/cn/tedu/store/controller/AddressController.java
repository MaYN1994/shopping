package cn.tedu.store.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.store.entity.Address;
import cn.tedu.store.service.IAddressService;
import cn.tedu.store.util.ResponseResult;

/**
 * 处理收货地址相关请求的控制器类
 */
@RestController
@RequestMapping("addresses")
public class AddressController extends BaseController {

	@Autowired
	private IAddressService addressService;
	
	@RequestMapping("addnew")
	public ResponseResult<Void> addnew(Address address, HttpSession session) {
		// 获取uid
		Integer uid = getUidFromSession(session);
		// 将uid封装到参数address中
		address.setUid(uid);
		// 获取用户名
		String username = session.getAttribute("username").toString();
		// 执行增加
		addressService.addnew(address, username);
		// 返回成功
		return new ResponseResult<>(SUCCESS);
	}
	
	@GetMapping("/")
	public ResponseResult<List<Address>> getByUid(
		HttpSession session) {
		// 获取uid
		Integer uid = getUidFromSession(session);
		// 调用业务层对象执行查询，并获取结果
		List<Address> data = addressService.getByUid(uid);
		// 返回成功+结果
		return new ResponseResult<>(SUCCESS, data);
	}
	
	@RequestMapping("/{aid}/set_default")
	public ResponseResult<Void> setDefault(
		@PathVariable("aid") Integer aid,
		HttpSession session) {
		// 获取uid和username
		Integer uid = getUidFromSession(session);
		String username = session.getAttribute("username").toString();
		// 执行
		addressService.setDefault(aid, uid, username);
		// 返回
		return new ResponseResult<>(SUCCESS);
	}
	
	@RequestMapping("/{aid}/delete")
	public ResponseResult<Void> delete(
		@PathVariable("aid") Integer aid,
		HttpSession session) {
		// 获取uid和username
		Integer uid = getUidFromSession(session);
		String username = session.getAttribute("username").toString();
		// 执行
		addressService.delete(aid, uid, username);
		// 返回
		return new ResponseResult<>(SUCCESS);
	}
	
}








