package com.turkcell.pair3.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="productservice")
public interface ProductServiceClient {

    @GetMapping("/api/products/findProductPriceById/{id}")
    double findProductPriceById(@PathVariable("id") int id);


}
