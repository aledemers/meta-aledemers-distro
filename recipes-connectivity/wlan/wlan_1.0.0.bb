FILESEXTRAPATHS:prepend = "${THISDIR}/${PN}:"

inherit systemd

LICENSE = "CLOSED"

SRC_URI = "file://wlan.service"

SYSTEMD_SERVICE:${PN} = "wlan.service"

do_install(){
	install -d ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/wlan.service ${D}/${systemd_unitdir}/system/
}
