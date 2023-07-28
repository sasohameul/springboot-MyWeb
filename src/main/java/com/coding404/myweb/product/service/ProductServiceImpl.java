package com.coding404.myweb.product.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public int productRegist(ProductVO vo) {
		//int result = productMapper.productRegist(vo);
		return productMapper.productRegist(vo);
	}

	@Override
	public ArrayList<ProductVO> getList(String writer) {
		return productMapper.getList(writer);
	}

	@Override
	public ProductVO getDetail(String prod_id) {

		return productMapper.getDetail(prod_id);
	}

	@Override
	public int productUpdate(ProductVO vo) {

		return productMapper.productUpdate(vo);
	}

	@Override
	public void productDelete(int prod_id) {
		
		productMapper.productDelete(prod_id);
	}


}
