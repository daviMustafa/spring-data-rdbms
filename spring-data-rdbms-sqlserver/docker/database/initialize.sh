# Typically SQL Server takes about 5-10 seconds to start up
# Wait for the SQL Server to come up (90 sec) You can reduce to 20sec and see
sleep 10s

#run the setup script to create the DB and the schema in the DB
sqlcmd -S localhost -U SA -P P@ssw0rd -i /var/opt/mssql/database/createDatabase.sql