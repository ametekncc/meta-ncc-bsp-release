# For TechNexion boards

LICENSE = "GPLv2"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "tn-imx_4.1.15_1.1.0_ga"

SRC_URI = "git://github.com/TechNexion/linux.git;branch=${SRCBRANCH} \
           file://defconfig \
"

SRCREV = "6223601fe84c4522602d5e7ffebd22ed6c4169ae"
LOCALVERSION = "-1.1.1-technexion"


COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

