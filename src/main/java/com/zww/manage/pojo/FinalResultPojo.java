package com.zww.manage.pojo;

/**
 * Created by Cynthia on 2018/1/25.
 */
public class FinalResultPojo {
    /**
     * 主键id
     */
    private String id;

    /**
     * 最终结果
     */
    private String finalResult;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 主键id
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * 主键id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 最终结果
     * @return
     */
    public String getFinalResult() {
        return finalResult;
    }

    /**
     * 最终结果
     * @param finalResult
     */
    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }

    /**
     * 表名
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 表名
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
