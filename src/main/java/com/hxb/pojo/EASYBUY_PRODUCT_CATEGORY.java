package com.hxb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 和学博
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EASYBUY_PRODUCT_CATEGORY {
    private int EPC_ID;
    private String EPC_NAME;
    private int EPC_PARENT_ID;
}
