

# spring-boot-security-oauth2

该项目是一个基于spring boot 1.4.5
整合spring security oauth2 

使用jwt方式存储的一个认证服务和资源服务分离的例子demo
1.auth-server 统一权限认证服务器，负责校验登录，获取token等
2.rsc-server api接口服务器,访问接口时带上token作为参数

版本不能升级到1.5.X，存在版本兼容问题


