# Getting Started

## PS: In case your maven already uses java version > 11, comment toolchain plugin in pom file.
## Otherwise check your toolchains.xml (pathToApacheMavenFolder/conf/toolchains.xml)
## Example:
    <toolchains>
        <toolchain>
            <type>jdk</type>
            <provides>
                <version>6</version>
            </provides>
            <configuration>
                <jdkHome>C:\Program Files\Java\jdk1.6.0_45</jdkHome>
            </configuration>
        </toolchain>
    
        <toolchain>
            <type>jdk</type>
            <provides>
                <version>8</version>
            </provides>
            <configuration>
                <jdkHome>C:\Program Files\Java\jdk1.8.0_241</jdkHome>
            </configuration>
        </toolchain>
    
        <toolchain>
            <type>jdk</type>
            <provides>
                <version>16</version>
            </provides>
            <configuration>
                <jdkHome>C:\Program Files\Java\jdk-16</jdkHome>
            </configuration>
        </toolchain>
    </toolchains>
