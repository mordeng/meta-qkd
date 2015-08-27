# meta-qkd
meta-qkd, yocto layer for AIT QKD software


inherit from openembeede-core


build/conf/local.conf: <br />
IMAGE_INSTALL_append = " aitqkd-source" <br />
IMAGE_INSTALL_append = " ttm-driver" <br />
IMAGE_INSTALL_append = " ttm-lib" <br />
IMAGE_INSTALL_append = " ttm-keystreaming" <br />
IMAGE_INSTALL_append = " ttm-demo"


build/conf/bblayer.conf: <br />
BBLAYERS ?= " \ <br />
  /home/lukas/yocto/openembedded-core/meta \ <br />
  /home/lukas/yocto/openembedded-core/meta-xilinx \ <br />
  /home/lukas/yocto/openembedded-core/meta-qkd \
  "