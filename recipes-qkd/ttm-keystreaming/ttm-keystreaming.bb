DESCRIPTION = "Time tagging test moodule for for streaming timetags from zedbaord to labview over tcp/ip" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 
DEPENDS = "boost ttm-lib"
S = "${WORKDIR}"
SRC_URI = "file:///home/lukas/yocto/openembedded-core/timetag.zip"
#LDFLAGS +=" -lttinterface" 
CXXFLAGS += " -std=c++11"
do_compile() {
		${CXX} ${CXXFLAGS} -c ${WORKDIR}/Networks.cpp -lttinterface
		${CXX} ${CXXFLAGS} ${LDFLAGS} ${WORKDIR}/Networks.cpp ${WORKDIR}/main.cpp -o ttkeys -lttinterface

}
 
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ttkeys ${D}${bindir}
}

