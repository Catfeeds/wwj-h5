package com.zww.room.controller;

import com.zww.room.service.RoomInfoService;
import com.zww.room.vo.RoomDetailShowVo;
import com.zww.room.vo.RoomInfoInputVo;
import com.zww.room.vo.RoomLatelyAwardRecordsVo;
import com.zww.util.AppResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 房间相关信息展示
 *
 * @author kuang
 * @since 2018.01.26
 * @version 1.0
 */
@Controller
@RequestMapping("/room")
public class RoomInfoController {

    /**
     * 房间相关信息展示Service
     */
    @Autowired
    private RoomInfoService roomInfoService;

    /**
     * 房间奖品详情展示
     * @param vo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/roomDetailShow", method = RequestMethod.POST)
    public AppResponseBody roomDetailShow(@RequestBody RoomInfoInputVo vo) {

        // 房间ID取得
        String roomId = vo.getRoomId();

        // 房间信息取得
        RoomDetailShowVo result = roomInfoService.getRoomDetailInfo(roomId);

        AppResponseBody app = new AppResponseBody();
        app.setData(result);
        app.setRetnCode(200);
        app.setRetnDesc("房间信息成功获得！");
        return app;
    }

    /**
     * 该房间的最近抓中记录展示
     * @param vo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/roomLatelyAwardRecordsShow", method = RequestMethod.POST)
    public AppResponseBody roomLatelyAwardRecordsShow(@RequestBody RoomInfoInputVo vo) {

        // 房间ID取得
        String roomId = vo.getRoomId();

        // 该房间最近抓中记录的获取
        List<RoomLatelyAwardRecordsVo> result = roomInfoService.getRoomLatelyAwardRecords(roomId);

        AppResponseBody app = new AppResponseBody();
        app.setData(result);
        app.setRetnCode(200);
        app.setRetnDesc("该房间最近抓中记录成功获取！");
        return app;
    }
}
