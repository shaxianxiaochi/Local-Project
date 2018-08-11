package com.subway.service;

import com.subway.pojo.SubwayInfo;

import java.util.List;

/**
 * 地铁线路业务逻辑接口
 */
public interface SubwayService {

    /**
     * 获取地铁线路信息集合
     * @return
     */
    List<SubwayInfo> getList();

    /**
     * 根据ID获取单个地铁线路信息
     * @param id
     * @return
     */
    SubwayInfo getSubwayInfoById(Integer id);

    /**
     * 更新地铁线路信息
     * @param subwayInfo
     * @return
     */
    int update(SubwayInfo subwayInfo);

    /**
     * 根据ID删除地铁信息
     * @param id
     * @return
     */
    int delete(int id);
}
