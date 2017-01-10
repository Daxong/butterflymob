package com.butterflymob.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.butterflymob.entity.Appinfo;
import com.butterflymob.entity.DeviceExample;
import com.butterflymob.entity.ShareeventExample;
import com.butterflymob.entity.UsrExample;
import com.butterflymob.entity.WillshareExample;
import com.butterflymob.mapper.AppinfoMapper;
import com.butterflymob.mapper.DeviceMapper;
import com.butterflymob.mapper.ShareeventMapper;
import com.butterflymob.mapper.UsrMapper;
import com.butterflymob.mapper.WillshareMapper;
import com.butterflymob.service.FindBaseInfo;
@Service
public class FindBaseInfoImpl implements FindBaseInfo
{
	
	
	@Autowired
	private AppinfoMapper appinfoMapper;
	@Autowired
	private ShareeventMapper shareMapper;
	@Autowired
	private WillshareMapper will;
	@Autowired
	private UsrMapper usr;
	@Autowired
	DeviceMapper deviceMapper;


	@Override
	@RequestMapping(value = "/getString", method = RequestMethod.POST, produces = "application/json")
	public Appinfo getBaseInfo(String appkey) {
		// TODO Auto-generated method stub
		Appinfo app=appinfoMapper.selectByPrimaryKey(appkey);
		Appinfo appinfo=new Appinfo();
		return appinfoMapper.selectByPrimaryKey(appkey);
	}

	@Override
	public long getCountShares() {
		// TODO Auto-generated method stub
		ShareeventExample share=new ShareeventExample();
		return shareMapper.countByExample(share);
	}

	@Override
	public long getCountWillShares() {
		// TODO Auto-generated method stub
		WillshareExample example=new WillshareExample();
		return will.countByExample(example);
	}

	@Override
	public long getCountBack() {
		// TODO Auto-generated method stub
		ShareeventExample example=new ShareeventExample();
		ShareeventExample.Criteria criteria=example.createCriteria();
		criteria.andIsbackEqualTo(1);
		shareMapper.countByExample(example);
		return 0;
	}

	@Override
	public float getBackRate() {
		// TODO Auto-generated method stub
		FindBaseInfoImpl find=new FindBaseInfoImpl();
		return find.getCountBack()/find.getCountShares();
	}

	@Override
	//取得授权用户数目
	public long getCountUsr() {
		// TODO Auto-generated method stub
		UsrExample example=new UsrExample();
		return usr.countByExample(example);
	}

	@Override
	public float getSharerate() {
		// TODO Auto-generated method stub
		//设备在where

		DeviceExample example=new DeviceExample();
		FindBaseInfoImpl find=new FindBaseInfoImpl();
		return find.getCountUsr()/deviceMapper.countByExample(example);

	}

}
