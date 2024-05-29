# Usa la imagen oficial de MySQL como base
FROM mysql:latest

# Establece las variables de entorno para la contraseña de root de MySQL
ENV MYSQL_ROOT_PASSWORD=1234
ENV MYSQL_DATABASE = Empresa

# Copia un script SQL personalizado para inicializar la base de datos
COPY ./init.sql /docker-entrypoint-initdb.d/