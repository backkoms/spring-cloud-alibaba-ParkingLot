package com.mall.parking.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.mall.parking.member.entity.Member;
import com.mall.parking.member.entity.MemberExample;
import com.mall.parking.member.mapper.MemberMapper;
import com.mall.parking.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public List<Member> list() {
		MemberExample example = new MemberExample();
		List<Member> members = memberMapper.selectByExample(example);
		return members;
	}

	@Override
	public int bindMobile(String json) {
		Member member = JSONObject.parseObject(json, Member.class);

		return memberMapper.insertSelective(member);
	}

}