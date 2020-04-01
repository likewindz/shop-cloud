package cn.cloud.service.weixin.impl;

import cn.cloud.service.api.weixin.WeixinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likeWind
 * @date created in 16:10 2020/4/1
 * @description
 */
@RestController
public class WeixinServiceImpl implements WeixinService {


    @Override
    public String weixin(String name) {
        System.out.println(name);
        return "123";
    }

}
