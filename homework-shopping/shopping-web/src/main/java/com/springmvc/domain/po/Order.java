package com.springmvc.domain.po;

import java.io.Serializable;

/**
 * 订单实体
 * <p>
 * Created by qudi on 2018/3/10.
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;

    /**
     * 买家id
     */
    private Long customerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
