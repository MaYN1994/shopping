package cn.tedu.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.store.entity.Good;
import cn.tedu.store.mapper.GoodMapper;
import cn.tedu.store.service.IGoodService;

@Service
public class GoodServiceImpl implements IGoodService {

	@Autowired
	GoodMapper goodMapper;

	@Override
	public List<Good> getHotList() {
		return findHotList();
	}

	@Override
	public Good getById(Long id) {
		return findById(id);
	}

	/**
	 * 查找热点商品
	 * 
	 * @return 热点商品列表
	 */
	private List<Good> findHotList() {
		return goodMapper.findHotList();
	}

	/**
	 * 根据商品id查询商品信息
	 * 
	 * @param id
	 *            商品id
	 * @return 商品信息
	 */
	private Good findById(Long id) {
		return goodMapper.findById(id);
	}

}
