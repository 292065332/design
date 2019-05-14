package com.pagoda.design.structuralModel.decorator.loginDemo;

public class SigninTest {
 
    public static void main(String[] args) {
        //原来的功能依旧会对外开放，新的功能同样也可以用
        //适配器中的方法，通常会打上过时的标签
        ISigninForThirdService signinForService = new SigninForThirdService(new SigninServiceImpl());
        signinForService.loginForQQ("testId");
    }
 
}
