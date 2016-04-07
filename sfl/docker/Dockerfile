FROM centos:7

ENV LANG en_US.utf8
ENV LC_ALL en_US.utf8
ENV HOME /home/builder
ENV SSH_AUTH_SOCK /home/builder/.sockets/ssh

RUN yum groups mark install "Development Tools" \
    && yum groups mark convert "Development Tools" \
    && yum -y groupinstall "Development Tools"
RUN yum -y install maven
RUN yum -y install wget
RUN wget -O /tmp/jre.rpm https://mirror.its.sfu.ca/mirror/CentOS-Third-Party/NSG/common/x86_64/jre-8u74-linux-x64.rpm \
    && rpm -hiv /tmp/jre.rpm \
    && rm -f /tmp/jre.rpm

ENV JAVA_HOME /usr/java/jre1.8.0_74

WORKDIR /home/builder/src
VOLUME /home/builder/src

