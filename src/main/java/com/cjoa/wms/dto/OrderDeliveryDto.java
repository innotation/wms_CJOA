package com.cjoa.wms.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class OrderDeliveryDto {

    private int orderCode;
    private int userCode;
    private String orderPayType;
    private int orderPrice;
    private String orderStatus;
    private String orderDate;

    private String orderRequest;
    private String orderDeliveryPhone;
    private String orderDeliveryAddress;
    private String orderDeliveryName;

    private List<CartDto> orderProdOptionList;


}
