IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us"

inherit image fs-overlay

CORE_OS = " \
    alsa-lib \
    coreutils \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    packagegroup-core-boot \
    tzdata \
    wlan \
    wpa-supplicant \
"

KERNEL_EXTRA = " \
    kernel-modules \
    linux-firmware \
"

DEV_SDK = " \
    cmake \
    diffutils \
    elfutils \
    elfutils-binutils \
    file \
    git \
    ldd \
    python3-modules \
    python3-pip \
    strace \
    packagegroup-core-buildessential \
"

EXTRA_TOOLS = " \
    alsa-tools \
    alsa-utils \
    bash \
    bzip2 \
    curl \
    e2fsprogs-mke2fs \
    ethtool \
    fbset \
    findutils \
    gdbserver \
    grep \
    htop \
    i2c-tools \
    iperf3 \
    iproute2 \
    iptables \
    less \
    nmap \
    procps \
    sysfsutils \
    tcpdump \
    unzip \
    usbutils \
    util-linux \
    util-linux-blkid \
    vim \
    wget \
    zip \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${DEV_SDK} \
    ${EXTRA_TOOLS} \
    ${KERNEL_EXTRA} \
"
