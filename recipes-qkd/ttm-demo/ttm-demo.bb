DESCRIPTION = "Time tagging test moodule for for streaming timetags from zedbaord to labview over tcp/ip" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 
DEPENDS = "boost ttm-lib"
S = "${WORKDIR}"
SRC_URI = "file:///home/lukas/yocto/openembedded-core/ttdemo.zip"
LDFLAGS +="-lttinterface " 
CXXFLAGS += " -std=c++11"
do_compile() {
		${CC} ${CCFLAGS} -c ${WORKDIR}/ttdemo.c  ${LDFLAGS}
	
		${CC} ${CCFLAGS} ttdemo.o -o ttdemo ${LDFLAGS}
}
 
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ttdemo ${D}${bindir}
}
