/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package com.zjtachao.fish.kiss.manage.mapper;

import com.zjtachao.fish.kiss.common.bean.domain.KissDevice;
import com.zjtachao.fish.kiss.common.bean.so.KissDeviceSo;

import java.util.List;

/**
 * 设备管理基础逻辑
 *
 * @author <a href="mailto:dh@zjtachao.com">duhao</a>
 * @since 2.0
 */
public interface KissDeviceMapper {

    /**
     * 查询单条数据
     * @param so
     * @return
     */
    public KissDevice queryDeviceByCode(KissDeviceSo so);


    /**
     * 查询设备数量
     * @param so
     * @return
     */
    public Long queryDeviceCount(KissDeviceSo so);

    /**
     * 查询列表
     * @param so
     * @return
     */
    public List<KissDevice> queryDeviceList(KissDeviceSo so);

    /**
     * 新增设备
     * @param device
     */
    public void addDevice(KissDevice device);

    /**
     * 修改设备
     * @param device
     */
    public void updateDevice(KissDevice device);

    /**
     * 删除设备
     * @param device
     */
    public void deleteDevice(KissDevice device);

    /**
     * 修改状态
     * @param device
     */
    public void updateDeviceStatus(KissDevice device);

}
