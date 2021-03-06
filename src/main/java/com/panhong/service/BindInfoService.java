package com.panhong.service;

import java.util.List;

import com.panhong.model.BindInfo;

public interface BindInfoService {
	
//	新增绑定信息
	public void addBindInfo(BindInfo bindInfo);
//	更新绑定信息
	public void updateBindInfo(BindInfo bindInfo);
//	删除绑定信息
	public void deleteBindInfo(BindInfo bindInfo);
//	通过用户Id和机器Id获取用户信息
	public BindInfo getBindInfoByOpenidAndDeviceID(String openid,String deviceid);
//	通过用户id获取绑定信息
	public List<BindInfo> getBindInfoByOpenid(String openid);
//	通过设备id获取绑定信息
	public List<BindInfo> getBindInfoByDeviceID(String deviceid);
//	获取所有设备绑定信息
	public List<BindInfo> getAllBindInfos();

}
