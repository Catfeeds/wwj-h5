package com.zww.callback.repository;

import com.zww.callback.pojo.StreamCloseInfoPojo;
import com.zww.callback.pojo.StreamCreateInfoPojo;
import org.springframework.stereotype.Component;

/**
 * 即构回调接口Mapper类
 *
 * @author kuang
 * @since 2018.02.07
 * @version 1.0
 */
@Component
public interface WwjliveMapper {

    /**
     * 追加即构回调流创建记录
     * @param pojo
     * @return
     */
    int insertStreamCreateInfo(StreamCreateInfoPojo pojo);

    /**
     * 追加即构回调流关闭记录
     * @param pojo
     * @return
     */
    int insertStreamCloseInfo(StreamCloseInfoPojo pojo);
}
