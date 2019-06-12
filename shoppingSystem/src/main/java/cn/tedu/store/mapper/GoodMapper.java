package cn.tedu.store.mapper;

import java.util.List;

import cn.tedu.store.entity.Good;

public interface GoodMapper {
	/**
	 * 查找热点商品
	 * @return 热点商品列表
	 */
	List<Good> findHotList();
	
	/**
	 * 根据商品id查询商品信息
	 * @param id 商品id
	 * @return 商品信息
	 */
	Good findById(Long id);
}
