package com.zww.trade.service;

import com.zww.trade.vo.UserPayInputVo;
import com.zww.util.AppResponseBody;

/**
 * 用户支付功能Service类
 *
 * @author kuang
 * @since 2018.02.01
 * @version 1.0
 */
public interface UserPayService {

    /**
     * 用户支付处理
     * @param vo
     * @return
     */
    AppResponseBody userPayHandle(UserPayInputVo vo);
}
