package com.zww.room.service;

import com.zww.encode.vo.ResultDecodeInputVo;

/**
 * 游戏结果处理service
 *
 * @author kuang
 * @since 2018.02.02
 * @version 1.0
 */
public interface RoomResultService {

    /**
     * 游戏结果处理
     * @param inputVo
     * @return
     */
    boolean roomResultHandle(ResultDecodeInputVo inputVo);
}
