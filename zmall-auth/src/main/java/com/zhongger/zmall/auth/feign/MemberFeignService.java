package com.zhongger.zmall.auth.feign;

import com.zhongger.zmail.common.utils.R;
import com.zhongger.zmall.auth.vo.UserLoginVo;
import com.zhongger.zmall.auth.vo.UserRegisterVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("member")
public interface MemberFeignService {
    @RequestMapping("member/member/register")
    R register(@RequestBody UserRegisterVo registerVo);


    @RequestMapping("member/member/login")
    R login(@RequestBody UserLoginVo loginVo);


}
