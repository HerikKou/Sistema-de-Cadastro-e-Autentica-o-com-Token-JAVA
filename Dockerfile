# Use uma imagem oficial do Java
FROM openjdk:21-jdk-slim

# Crie um diretório de trabalho dentro do container
WORKDIR /app

# Copie os arquivos do projeto para o container
COPY . /app

# Compile os arquivos Java
RUN javac Main.java Pessoa.java

# Comando para executar o programa
CMD ["java", "Main"]