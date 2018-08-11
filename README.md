### 1. 如何配置镜像
#### 1.1 配置jib
```$xslt
<plugin>
    <groupId>com.google.cloud.tools</groupId>
    <artifactId>jib-maven-plugin</artifactId>
    <version>0.9.7</version>
    <configuration>
        <from>
            <!--基础镜像-->
            <image>registry.hub.docker.com/openjdk:8-jdk-alpine</image>
        </from>
        <to>
            <!--上传到docker hub上的镜像的位置-->
            <image>registry.hub.docker.com/guoxiaohuihui/simple-server</image>
        </to>
    </configuration>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>build</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```
#### 1.2 配置maven的settings.xml
```$xslt
<servers>
    <server>
        <!--docker 官方的镜像仓库地址-->
        <id>registry.hub.docker.com</id>
        <!--docker id-->
        <username>guo****"***</username>
        <!--docker id的密码-->
        <password>*******</password>
    </server>
</servers>
```
### 2. 注意事项

#### 2.1 jib版本选择
截止至2018年08月12日为止，如果使用0.9.7版本的jib进行镜像构建是没有问题，但是使用最新的jib版本0.9.8是无法进行正常构建的。会出现401权限校验错误
#### 2.2 对于配置maven的settings.xml时，不推荐使用明文密码
推荐采用以下命令对明文密码进行加密，然后将其返回值作为密码
```
mvn --encrypt-master-password your_password
```
