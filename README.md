
<p><bold>spring-boot-security-oauth2</bold></p>
项目基于spring boot 1.4.5<br/>
整合spring security oauth2 <br/>
使用jwt方式存储的一个认证服务和资源服务分离的例子<br/>
1.auth-server token认证服务
2.rsc-server api资源服务,用户授权成功后拿到token访问有效资源<br/>

注意:版本不能升级到1.5.X,有版本兼容问题<br/>

提交历史<br/>

mongdb换成普通jpa，在本地便于测试<br/>
github切换新分支develop后maven无法编译
