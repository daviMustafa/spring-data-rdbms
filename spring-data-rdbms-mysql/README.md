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

## Steps
    - Install docker (Tested on linux containers)
    - Run: 'mvn clean package -Pdocker' to generate jar file
    - Go to your project folder and run 'docker-compose config' to check for docker-compose file errors
    - Run docker-compose up --build

## Using Intellij Http Request to test:

    POST http://localhost:8081/spring-data-mysql-db/customer
    accept: application/json;charset=UTF-8
    Content-Type: application/json;charset=UTF-8
    
    {
        "firstName": "Teste",
        "lastName": "Teste"
    }

    GET http://localhost:8081/spring-data-mysql-db/customer
    accept: application/json;charset=UTF-8
    Content-Type: application/json;charset=UTF-8

## This application has no external scripts to be executed to control when this java app is going to boot, so
## it will probably fail at first because `mysql database` is not properly started yet.
## Workaround: Looking in docker-compose.yml file `backend` service has a `restart: on-failure` property. 