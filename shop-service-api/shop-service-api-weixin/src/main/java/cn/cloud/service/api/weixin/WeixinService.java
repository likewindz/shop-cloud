package cn.cloud.service.api.weixin;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author likeWind
 * @date created in 16:03 2020/4/1
 * @description
 */
public interface WeixinService {

    /**
     * @param name 用户名
     * @return 返回123
     */
    @GetMapping("weixin")
    String weixin(String name);

}
