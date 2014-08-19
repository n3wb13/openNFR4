DESCRIPTION = "Merge machine and distro options to create a enigma2 machine task/package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "1.0"
PR = "r39"

inherit packagegroup

DEPENDS = "opennfr-feeds"

RDEPENDS_${PN} = "\
        enigma2-plugin-extensions-autotimer \
	enigma2-plugin-extensions-epgsearch \
	enigma2-plugin-extensions-mediaplayer \
	enigma2-plugin-extensions-cutlisteditor \
	enigma2-plugin-extensions-menusort \
	enigma2-plugin-extensions-customsubservices \
	enigma2-plugin-extensions-infopanel \
	enigma2-plugin-extensions-bmediacenter \
	enigma2-plugin-extensions-imdb \
	\
	enigma2-plugin-systemplugins-fastscan \
	enigma2-plugin-systemplugins-softwaremanager \
	enigma2-plugin-systemplugins-hotplug \
	${@base_contains("MACHINE_FEATURES", "videoenhancement", "", "enigma2-plugin-systemplugins-videoenhancement", d)} \
	\
	enigma2-plugin-skins-utopia-hd \
	opennfr-base-files \
	 \
	${@base_contains("MACHINE_FEATURES", "boxmodel", "boxmodel" , "", d)} \
	"

