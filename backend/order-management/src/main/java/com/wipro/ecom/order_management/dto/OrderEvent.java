
package com.wipro.ecom.order_management.dto; 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String eventType; // e.g., "ORDER_PLACED", "ORDER_CANCELLED"
    private List<OrderItemDetail> items;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class OrderItemDetail {
        private Integer productId;
        private int quantity;
    }
}
