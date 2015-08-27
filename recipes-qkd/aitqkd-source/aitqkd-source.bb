DESCRIPTION = "AIT QKD R10 Software" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 
DEPENDS = "libtool dbus boost"
S = "${WORKDIR}/git"


SRC_URI[md5sum] = "5ffeb2b528a0f7411b3f273fc5a93771"
SRC_URI[sha256sum] = "a214bc1e94ffad4e8fa22de4994083cf29a5c21a17b0f3f031813190399a24a1"

SRC_URI = "git://git-service.ait.ac.at/quantum-cryptography/qkd.git;protocol=https;rev=v9.9999.4"
SRC_URI += "file://cmakelist_compiler_settings.patch;patch=1"
SRC_URI += "file://cmakelist_remove_latex.patch;patch=2"
SRC_URI += "file://cmakelist_install_tests.patch;patch=3"

RDEPENDS_${PN} += " zeromq qwt libicui18n"

inherit qt4x11 pkgconfig cmake  