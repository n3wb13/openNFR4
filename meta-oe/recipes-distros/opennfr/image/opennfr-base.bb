SUMMARY = "Base packages require for image."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"

PV = "1.0"
PR = "r18"

inherit packagegroup

RDEPENDS_${PN} = "\
    ca-certificates \
    oe-alliance-base \
    opennfr-enigma2 \
    opennfr-bootlogo \
    opennfr-version-info \
    opennfr-base-files \
    opennfr-settings \
    openssh-sftp-server \
    ntfs-3g \
    packagegroup-base-smbfs-client \
    packagegroup-base-smbfs-server \
    packagegroup-base-smbfs-utils \		
    hddtemp \
    busybox-cron \
    exteplayer3 \
    gstplayer \
    ffmpeg \
    enigma2-plugin-systemplugins-serviceapp \ 	
    python-imaging \
    python-requests \
    python-cfscrape \
    python-js2py \
    ofgwrite \
    python-gdata \
    libshowiframe \
    dvbsnoop \
	${@bb.utils.contains("TUNE_FEATURES", "armv", "glibc-compat", "", d)} \
    bash \	
    enigma2-plugin-drivers-usbserial \ 
    "
RDEPENDS_${PN}_append_blackbox7405 = "\
	ciplushelperu \
	"
	
RDEPENDS_${PN}_append_vusolo4k = "\
	ciplushelperu \
	"

RDEPENDS_${PN}_append_hd2400 = "\
    ciplushelper \
    "

RDEPENDS_${PN}_append_formuler1 = "\
    ciplushelper \
    "

RDEPENDS_${PN}_append_formuler3 = "\
    ciplushelper \
    "

RDEPENDS_${PN}_append_formuler4 = "\
    ciplushelper \
    "

RDEPENDS_${PN}_append_formuler4turbo = "\
    ciplushelper \
    "

RDEPENDS_${PN}_append_triplex = "\
    ciplushelper \
    "

RDEPENDS_${PN}_append_hd51 = "\
    ciplushelper2 \
    "
	
RDEPENDS_${PN}_append_xc7362 = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_xc7346 = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_7100s = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_7210s = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_7400s = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_g300 = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_g100 = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_sf4008 = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_vg5000 = "\
    ciplushelperu \
    "

RDEPENDS_${PN}_append_vusolo2 = "\
    ciplushelpers \
    "
RDEPENDS_${PN}_append_gb7362 = "\
    ciplushelper1 \
	enigma2-plugin-extensions-socketmmi \
    "
RDEPENDS_${PN}_append_gb7358 = "\
    ciplushelper1 \
	enigma2-plugin-extensions-socketmmi \
    "
RDEPENDS_${PN}_append_gb7356 = "\
    ciplushelper1 \
	enigma2-plugin-extensions-socketmmi \
    "
