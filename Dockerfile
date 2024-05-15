FROM openjdk:21-jdk-slim

LABEL mainers=eliasmflilico@gmail.com

ARG JAR_FILE
ARG PORT
ARG PROFILE

ENV PROFILE $PROFILE

# Required by container health check
RUN apt-get update \
    && apt-get install -y curl \
    && apt-get clean

ENV TZ America/Sao_Paulo

ENV SERVER_PORT $POR
ENV SPRING_PROFILES_ACTIVE dev
COPY ./build/native/nativeCompile/demo /

EXPOSE $PORT

CMD ./demo

