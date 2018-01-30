package com.zww.encode.pojo;

/**
 * 房间配置信息表实体类
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
public class RoomConfigInfoPojo {

    /**
     * 主键id
     */
    private int id;

    /**
     * 机器id
     */
    private int machineId;

    /**
     * 游戏总时长
     */
    private int gameTime;

    /**
     * 抓起爪力(1-100)
     */
    private int clawPowerGrab;

    /**
     * 到顶爪力(1-100)
     */
    private int clawPowerUp;

    /**
     * 移动爪力(1-100)
     */
    private int clawPowerMove;

    /**
     * 抓起高度（0-10）
     */
    private int upHeight;

    /**
     * 可用标志
     */
    private int effective;

    /**
     * 主键id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 主键id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 机器id
     * @return
     */
    public int getMachineId() {
        return machineId;
    }

    /**
     * 机器id
     * @param machineId
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    /**
     * 游戏总时长
     * @return
     */
    public int getGameTime() {
        return gameTime;
    }

    /**
     * 游戏总时长
     * @param gameTime
     */
    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }

    /**
     * 抓起爪力(1-100)
     * @return
     */
    public int getClawPowerGrab() {
        return clawPowerGrab;
    }

    /**
     * 抓起爪力(1-100)
     * @param clawPowerGrab
     */
    public void setClawPowerGrab(int clawPowerGrab) {
        this.clawPowerGrab = clawPowerGrab;
    }

    /**
     * 到顶爪力(1-100)
     * @return
     */
    public int getClawPowerUp() {
        return clawPowerUp;
    }

    /**
     * 到顶爪力(1-100)
     * @param clawPowerUp
     */
    public void setClawPowerUp(int clawPowerUp) {
        this.clawPowerUp = clawPowerUp;
    }

    /**
     * 移动爪力(1-100)
     * @return
     */
    public int getClawPowerMove() {
        return clawPowerMove;
    }

    /**
     * 移动爪力(1-100)
     * @param clawPowerMove
     */
    public void setClawPowerMove(int clawPowerMove) {
        this.clawPowerMove = clawPowerMove;
    }

    /**
     * 抓起高度（0-10）
     * @return
     */
    public int getUpHeight() {
        return upHeight;
    }

    /**
     * 抓起高度（0-10）
     * @param upHeight
     */
    public void setUpHeight(int upHeight) {
        this.upHeight = upHeight;
    }

    /**
     * 可用标志
     * @return
     */
    public int getEffective() {
        return effective;
    }

    /**
     * 可用标志
     * @param effective
     */
    public void setEffective(int effective) {
        this.effective = effective;
    }
}
