SUMMARY = "Simple DRM framebuffer emulator"
AUTHOR = "Stefan Eichenberger"

S = "${WORKDIR}/git"

LICENSE = "GPLv3.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=7702f203b58979ebbc31bfaeb44f219c"

DEPENDS += "libdrm"

TARGET_CFLAGS += "-pedantic -I =/usr/include/libdrm"
TARGET_LDFLAGS += "-ldrm"

SRC_URI = "git://github.com/embear-engineering/drm-framebuffer.git;protocol=https;branch=main;"

SRCREV = "80aceca25150ff52131fd1c9d10adf3b921041d4"

SRC_URI[md5sum] = "c4867d72c41564318e0107745eb7a0f2"
SRC_URI[sha256sum] = "7e4487d320ac31558563424189435d396ddf77953bb23111a17a3d1487b5794a"
