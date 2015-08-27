DESCRIPTION = "ttdriver" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 

S = "${WORKDIR}/ttm-1.0"
SRC_URI = "file:///home/lukas/yocto/openembedded-core/ttmlib.zip;subdir=ttm-1.0"

do_compile[noexec] = "1"
do_install(){
	

	install -d ${D}${includedir}
	install -d ${D}${libdir}

	install -m 0777 ${S}/usr/include/* ${D}${includedir}
	install -m 0777 ${S}/usr/lib/* ${D}${libdir}
}
FILES_${PN} ="/usr/lib/libttinterface.so"
FILES_${PN}-dev ="/usr/include/ttinterface.h"