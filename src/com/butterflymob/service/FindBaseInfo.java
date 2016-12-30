package com.butterflymob.service;


import com.butterflymob.entity.Appinfo;
/**
 * 满足概览 今日数据所需数据
 * @author ilove
 *
 */
public interface FindBaseInfo {
	/**
	 * 根据appkey查看应用基础信息
	 * @return
	 */
	public Appinfo getBaseInfo(String appkey);
	
	/**
	 * 获取分享数
	 */
	public long getCountShares();
	
	/**
	 * 获取意向分享数
	 */
	public long getCountWillShares();
	
	/**
	 * 获取回流数 
	 * 通过短链转换服务转换分享内容中的链接后，每一次点击这条短链，就算是一次回流。
	 * @return
	 */
	public long getCountBack();
	
	/**
	 * 计算回流率
	 * 回流率 = 回流数 / 分享数，比率越大，说明信息传播效应越好。
	 * @return
	 */
	public float getBackRate();
	
	/**
	 * 获取授权用户数目
	 * 直接统计usr表中id数目即可
	 * @return
	 */
	public long getCountUsr();
	
	/**
	 * 计算分享率
	 * 分享率反映的是授权用户与设备之间的比率，比率越高，说明用户分享意愿越大。
	 * @return
	 */
	public float getSharerate();
	
}
