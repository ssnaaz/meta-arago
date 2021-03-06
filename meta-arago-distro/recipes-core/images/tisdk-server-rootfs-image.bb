# Arago TI SDK filesystem image
COMPATIBLE_MACHINE = "omap3|omapl138|ti33x|keystone"

require arago-image.inc

SPLASH = ""

IMAGE_INSTALL += "\
    packagegroup-arago-base \
    packagegroup-arago-console \
    packagegroup-arago-base-tisdk \
    packagegroup-arago-tisdk-addons \
    packagegroup-arago-tisdk-crypto \
    packagegroup-arago-tisdk-matrix \
    packagegroup-arago-base-tisdk-server-extra \
    gdb \
"

export IMAGE_BASENAME = "tisdk-rootfs"
