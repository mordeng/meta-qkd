# meta-qkd
meta-qkd, yocto layer for AIT QKD software


inherit from openembeede-core


build/conf/local.conf:
IMAGE_INSTALL_append = " aitqkd-source"
IMAGE_INSTALL_append = " ttm-driver"
IMAGE_INSTALL_append = " ttm-lib"
IMAGE_INSTALL_append = " ttm-keystreaming"
IMAGE_INSTALL_append = " ttm-demo"


build/conf/bblayer.conf:
BBLAYERS ?= " \
  /home/lukas/yocto/openembedded-core/meta \
  /home/lukas/yocto/openembedded-core/meta-xilinx \
  /home/lukas/yocto/openembedded-core/meta-qkd \
  "