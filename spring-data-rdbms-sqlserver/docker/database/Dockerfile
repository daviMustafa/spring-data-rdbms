FROM microsoft/mssql-server-linux:2017-latest
LABEL maintainer="daviMustafa"

#SET DEFAULT ENV VARIABLES ( accept user agreement + sql server password)
ENV ACCEPT_EULA Y
ENV MSSQL_SA_PASSWORD P@ssw0rd

RUN mkdir -p /var/opt/mssql/database
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY docker/database/createDatabase.sql /var/opt/mssql/database
COPY docker/database/initialize.sh /usr/src/app/

ENV PATH=$PATH:/opt/mssql/bin:/opt/mssql-tools/bin

# Grant permissions for the import-data script to be executable
RUN chmod +x /usr/src/app/initialize.sh

#start sql server, wait for start to finish and execute startup scripts
RUN ( /opt/mssql/bin/sqlservr --accept-eula & ) | grep -q "Service Broker manager has started" && /usr/src/app/initialize.sh

