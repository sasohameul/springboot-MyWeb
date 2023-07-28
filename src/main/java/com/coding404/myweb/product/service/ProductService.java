package com.coding404.myweb.product.service;

import java.util.ArrayList;

import com.coding404.myweb.command.ProductVO;

public interface ProductService {

	public int productRegist(ProductVO vo);
	public ArrayList<ProductVO> getList(String writer); //조회
	public ProductVO getDetail(String prod_id);
	public int productUpdate(ProductVO vo);
	public void productDelete(int prod_id);
}
