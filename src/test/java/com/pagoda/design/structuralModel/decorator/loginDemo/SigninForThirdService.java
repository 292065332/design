package com.pagoda.design.structuralModel.decorator.loginDemo;

public class SigninForThirdService implements ISigninForThirdService{
 
    private ISigninService signinService;
 
    public SigninForThirdService(ISigninService signinService){
        this.signinService = signinService;
    }
 
    /**
     * 不需要修改的，就直接调用原来的
     */
    @Override
    public Object regist(String username, String password) {
        return signinService.regist(username,password);
    }
 
    /**
     * 如果针对原来的方法，有修改的，这里也可以直接覆盖
     */
    @Override
    public Object login(String username, String password) {
        return signinService.login(username,password);
    }
 
    public Object loginForQQ(String id){
        System.out.println("利用QQ进行登录");
        return loginForRegist(id,"QQ_EMPTY");
    }
 
    public Object loginForWeChat(String id){
        System.out.println("利用微信进行登录");
        return null;
    }
 
    public Object loginForToken(String id){
        System.out.println("利用标示进行登录");
        return null;
    }
 
    public Object loginForTelephone(String telephone,String code){
        System.out.println("利用手机号进行登录");
        return null;
    }
 
    public Object loginForRegist(String username,String password){
        this.regist(username,"password");
        Object Object=this.login(username,"QQ_EMPTY");
        return Object;
    }
}
