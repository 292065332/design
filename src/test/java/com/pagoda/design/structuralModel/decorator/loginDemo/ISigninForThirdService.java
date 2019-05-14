package com.pagoda.design.structuralModel.decorator.loginDemo;

public interface ISigninForThirdService extends ISigninService{
    public Object loginForQQ(String id);
 
    public Object loginForWeChat(String id);
 
    public Object loginForToken(String id);
 
    public Object loginForTelephone(String telephone,String code);
 
    public Object loginForRegist(String username, String password);
}
