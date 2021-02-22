package com.zhongger.zmail.member.service.impl;

import com.zhongger.zmail.member.vo.MemberLoginVo;
import com.zhongger.zmail.member.vo.MemberRegisterVo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.common.utils.Query;

import com.zhongger.zmail.member.dao.MemberDao;
import com.zhongger.zmail.member.entity.MemberEntity;
import com.zhongger.zmail.member.service.MemberService;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberEntity> page = this.page(
                new Query<MemberEntity>().getPage(params),
                new QueryWrapper<MemberEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public MemberEntity login(MemberLoginVo loginVo) {

        String loginAccount = loginVo.getLoginAccount();
        //以用户名或电话号登录的进行查询
        MemberEntity entity = this.getOne(new QueryWrapper<MemberEntity>().eq("username", loginAccount).or().eq("mobile", loginAccount));
        if (entity!=null){
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            boolean matches = bCryptPasswordEncoder.matches(loginVo.getPassword(), entity.getPassword());
            if (matches){
                entity.setPassword("");
                return entity;
            }
        }
        return null;
    }

    @Override
    public void register(MemberRegisterVo registerVo) {

    }

}