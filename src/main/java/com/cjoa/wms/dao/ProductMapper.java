package com.cjoa.wms.dao;

import com.cjoa.wms.dto.OrderProdOptionDeliveryDto;
import com.cjoa.wms.dto.ProductDto;

import java.util.List;

public interface ProductMapper {

    List<ProductDto> selectAllProduct();
    List<ProductDto> selectProductByCategory(int code);
    List<ProductDto> selectProductByProdKeyword(String key);
    List<ProductDto> selectProductOptionListByProdCode(int code);

    List<OrderProdOptionDeliveryDto> selectAllStockList();

    ProductDto checkStockByProdCode(int menu);
}
