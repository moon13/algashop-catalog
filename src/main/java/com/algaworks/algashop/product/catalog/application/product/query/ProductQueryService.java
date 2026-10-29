package com.algaworks.algashop.product.catalog.application.product.query;

import com.algaworks.algashop.product.catalog.presentation.ProductController;

import java.util.UUID;

public interface ProductQueryService {

      ProductDetailOutput findById(UUID id);
      PageModel<ProductDetailOutput> filter(Integer size, Integer number);

}
