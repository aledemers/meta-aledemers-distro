SUMMARY = "Orange Pi Image with Docker and K3S support, No Graphics"

require base-dev-image.inc

IMAGE_INSTALL += " \
    docker-ce \
    k3s \
"

export IMAGE_BASENAME = "orangepi-docker-image"
