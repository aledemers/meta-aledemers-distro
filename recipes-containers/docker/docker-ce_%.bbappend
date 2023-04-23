# The only enabled service in docker-ce_git.bb is docker.socket,
# but on our embedded device we want dockerd to start all the time.
# With docker.socket enabled, dockerd starts only when it is 
# contacted through its socket.

DOCKERD_SERVICE_PACKAGE := "dockerd-service"

PACKAGES =+ "${DOCKERD_SERVICE_PACKAGE}"
SYSTEMD_PACKAGES += "${DOCKERD_SERVICE_PACKAGE}"
SYSTEMD_SERVICE:${DOCKERD_SERVICE_PACKAGE} = "docker.service"

RDEPENDS:${PN} += "${DOCKERD_SERVICE_PACKAGE}"
