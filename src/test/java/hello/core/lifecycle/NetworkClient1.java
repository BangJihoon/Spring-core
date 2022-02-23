package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient1 implements InitializingBean, DisposableBean {
    private String url;
    public NetworkClient1(){
        System.out.println("생성자 호출 url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect(){
        System.out.println("connect : " + url);
    }
    public void call(String msg){
        System.out.println("call : " + url);
        System.out.println("call msg = " + msg);
    }
    public void disconnect(){
        System.out.println("close : " + url);
    }

    @Override
    public void destroy()  {
        disconnect();
    }

    @Override
    public void afterPropertiesSet()  {
        connect();
        call("초기화 연결 매세지");
    }
}