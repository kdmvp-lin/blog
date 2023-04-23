- **应用架构**

**技术架构**

# 主要技术栈

## 前端

1.Vue.js  
2.ElementUI  
3.axios   

## 后端

1.Spring Boot  
2.Apache Shiro
3.Apache Log4j2
4.Spring Data JPA
5.Spring Data Redis

## 数据库

1.MySQL  
2.Redis

# 部署方法

1.clone 项目到本地

`git clone https://github.com/Antabot/White-Jotter`

2.在 mysql 中创建数据库 `wj`，运行项目，将自动注入数据。如需关闭此功能，请将 `application.properties` 中的 `spring.datasource.initialization-mode=always` 代码删除。

数据库完整脚本 `wj.sql` 放在后端项目的 `src\main\resources` 目录下，也可根据需要自行在 MySQL 中执行数据库脚本。  

运行项目前请启动 Redis 服务，端口为 6379（默认端口），密码为空。

3.数据库配置在后端项目的 `src\main\resources` 目录下的`application.properties` 文件中，mysql 版本为 8.0.15   。

4.在IntelliJ IDEA中运行后端项目，为了保证项目成功运行，可以右键点击 `pom.xml` 选择 maven -> reimport ，并重启项目

至此，服务端就启动成功了，同时，运行前端项目，访问 `http://localhost:8080` ，即可进入登录页面，默认账号是 `admin`，密码是 `123`

如果要做二次开发，请继续看第五、六步。

5.进入前端项目根目录中，在命令行依次输入如下命令：  

```
# 安装依赖
npm install

# 在 localhost:8080 启动项目
npm run dev

```

由于在 `wj-vue` 项目中已经配置了端口转发，将数据转发到SpringBoot上，因此项目启动之后，在浏览器中输入 `http://localhost:8080` 就可以访问我们的前端项目了，所有的请求通过端口转发将数据传到 SpringBoot 中（注意此时不要关闭 SpringBoot 项目）。

6.最后可以用 `WebStorm` 等工具打开 `wj-vue`项目，继续开发，开发完成后，当项目要上线时，依然进入到 `wj-vue` 目录，然后执行如下命令：  

```
npm run build
```

该命令执行成功之后， `wj-vue` 目录下生成一个 `dist` 文件夹，可以将该文件夹中的两个文件 `static` 和 `index.html` 拷贝到 `wj` 项目中 `resources/static/` 目录下，然后直接运行 `wj` 项目，访问 `http://localhost:8443` ，实际上是把前端打包后作为静态文件，但不推荐使用这种方式。



# 
