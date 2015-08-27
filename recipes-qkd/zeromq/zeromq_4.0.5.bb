DESCRIPTION = "ZeroMQ looks like an embeddable networking library but acts like a concurrency framework"
HOMEPAGE = "http://www.zeromq.org"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=d5311495d952062e0e4fbba39cbf3de1"

SRC_URI = "http://download.zeromq.org/zeromq-${PV}.tar.gz \
           file://run-ptest \
           "
SRC_URI[md5sum] = "73c39f5eb01b9d7eaf74a5d899f1d03d"
SRC_URI[sha256sum] = "3bc93c5f67370341428364ce007d448f4bb58a0eaabd0a60697d8086bc43342b"

S = "${WORKDIR}/zeromq-${PV}"

#Uncomment to choose polling system manually. valid values are kqueue, epoll, devpoll, poll or select
#EXTRA_OECONF += "--with-poller=kqueue"
#CFLAGS_append += "-O0"
#CXXFLAGS_append += "-O0"
RDEPENDS_${PN} +=" util-linux-libuuid"

inherit autotools ptest

do_install_ptest () {
        install -d ${D}${PTEST_PATH}/tests
        install -m 0755 ${B}/tests/.libs/* ${D}${PTEST_PATH}/tests
}