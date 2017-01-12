发邮件常见的错误：
1.授权码 spring.mail.password
对于一般邮箱：授权码是要自己去生成的
企业邮箱：授权码就是自己的邮箱密码

网易邮箱错误指导：
http://www.mail163.cn/fault/analysis/1109.html
授权码生成：
http://jingyan.baidu.com/article/cd4c29790f2a2b756f6e6057.html


2.Could not send email: Could not convert socket to TLS
 注释掉这个配置<prop key="mail.smtp.starttls.enable">true</prop>


 3.QQ邮箱官方说明
 POP3/SMTP协议
 接收邮件服务器：pop.exmail.qq.com ，使用SSL，端口号995
 发送邮件服务器：smtp.exmail.qq.com ，使用SSL，端口号465
 海外用户可使用以下服务器
 接收邮件服务器：hwpop.exmail.qq.com ，使用SSL，端口号995
 发送邮件服务器：hwsmtp.exmail.qq.com ，使用SSL，端口号465


 IMAP协议
 接收邮件服务器：imap.exmail.qq.com ，使用SSL，端口号993
 发送邮件服务器：smtp.exmail.qq.com ，使用SSL，端口号465
 海外用户可使用以下服务器
 接收邮件服务器：hwimap.exmail.qq.com ，使用SSL，端口号993
 发送邮件服务器：hwsmtp.exmail.qq.com ，使用SSL，端口号465