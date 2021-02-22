package com.zhongger.zmail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.member.entity.MemberEntity;
import com.zhongger.zmail.member.vo.MemberLoginVo;
import com.zhongger.zmail.member.vo.MemberRegisterVo;

import java.util.Map;

/**
 * 会员
 *
 * @author zhongmingyi
 * @email zhongmingyi@bytedance.com
 * @date 2019-10-08 09:47:05
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    MemberEntity login(MemberLoginVo loginVo);

    void register(MemberRegisterVo registerVo);
}

