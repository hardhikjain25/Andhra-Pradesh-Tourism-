FROM jenkins/jenkins:lts

USER root

RUN apt-get update && \
    apt-get install -y git curl wget unzip maven docker.io && \
    curl -LO "https://dl.k8s.io/release/v1.31.0/bin/linux/amd64/kubectl" && \
    install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl && \
    rm kubectl

USER jenkins