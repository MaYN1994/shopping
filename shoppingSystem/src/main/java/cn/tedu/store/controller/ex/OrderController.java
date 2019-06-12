package cn.tedu.store.controller.ex;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.store.controller.BaseController;
import cn.tedu.store.service.IOrderService;
import cn.tedu.store.util.ResponseResult;

@RestController
@RequestMapping("orders")
public class OrderController extends BaseController {
	@Autowired
	IOrderService orderService;
	
	@RequestMapping("create")
	public ResponseResult<Void> create(HttpSession session,Integer[] cids,Integer aid){
		String username=session.getAttribute("username").toString();
		Integer uid=getUidFromSession(session);
		orderService.create(aid, cids, uid, username);
		return new ResponseResult<Void>(SUCCESS);
	}
	
}
