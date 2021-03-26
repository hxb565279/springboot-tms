package com.hxb.pojo;

import lombok.Data;

/**
 * @author 和学博
 */
@Data
public class EASYBUY_PRODUCT {
    private int EP_ID;
    private String EP_NAME;
    private String EP_DESCRIPTION;
    private int EP_PRICE;
    private int EP_STOCK;
    private int EPC_ID;
    private int EPC_CHILD_ID;
    private String EP_FILE_NAME;
}
