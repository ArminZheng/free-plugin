# Free Plugin

for freedom <3

### Usage

Add the following to `pom.xml`:

```
<project>

    ...

    <pluginRepositories>
        <pluginRepository>
            <id>free-plugin</id>
            <name>Free Plugin</name>
            <url>https://arminzheng.github.io/free-plugin/free-plugin/</url>
        </pluginRepository>
    </pluginRepositories>

    <build>
        <plugins>
            <plugin>
                <groupId>com.arminzheng</groupId>
                <artifactId>free-plugin</artifactId>
                <version>0.0.1</version>
                <executions>
                    <execution>
                        <id>another-id</id>
                        <goals>
                            <goal>hello</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <name>jack</name>
                    <args>rose</args>
                    <messages>
                        <suibianxie>Titanic</suibianxie>
                        <suibianxie>boat</suibianxie>
                    </messages>
                </configuration>
            </plugin>
        </plugins>
    </build>

    ...

</project>
```