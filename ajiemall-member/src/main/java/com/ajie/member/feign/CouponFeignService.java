package com.ajie.member.feign;

import com.ajie.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:hyj
 * @date:2022/10/17
 */
@FeignClient("ajiemall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
