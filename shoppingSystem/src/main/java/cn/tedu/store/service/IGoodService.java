package cn.tedu.store.service;

import java.util.List;
import cn.tedu.store.entity.Good;


public interface IGoodService {
	
	/**
	 * 查询热点商品
	 * @return 热点商品列表
	 */
	List<Good> getHotList();
	
	/**
	 * 根据商品id查询商品信息
	 * @param id 商品id
	 * @return 商品信息
	 */
	Good getById(Long id);
	
}
