package rpc.server.example;

import org.springframework.stereotype.Component;

/**
 * <br/>==========================
 * @author cxshun(cxshun@gmail.com)
 * @date 2017/11/28
 * <br/>==========================
 */
@Component
public class HelloRpcImpl implements HelloRpc{
    @Override
    public void sayHello(String name) {
        System.out.println("hello:" + name);
    }
}
