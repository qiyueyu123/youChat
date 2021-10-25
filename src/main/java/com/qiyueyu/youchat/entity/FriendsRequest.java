package com.qiyueyu.youchat.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lql
 * @since 2021-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FriendsRequest对象", description="")
public class FriendsRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发送人id")
    private String sendUserId;

    @ApiModelProperty(value = "接收人id")
    private String acceptUserId;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime requestDataTime;


}