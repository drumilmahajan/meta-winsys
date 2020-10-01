DESCRIPTION = "WinSystems Image to validate machines. \
This image contains everything used to test machines including GUI, \
demos and lots of applications. This creates a very large image, not \
suitable for production."
LICENSE = "MIT"

require dynamic-layers/qt5-layer/recipes-fsl/images/imx-image-full.bb

### WARNING: This image is NOT suitable for production use and is intended
###          to provide a way for users to reproduce the image used during
###          the validation process of C444 BSP releases.

CORE_IMAGE_EXTRA_INSTALL += " \
	iperf3 \
	ffmpeg \
	hdparm \
	packagegroup-core-buildessential \
	htop \
	stress-ng \
	glmark2 \
	util-linux \
	util-linux-hwclock \
	wget \
	packagegroup-security-tpm2 \
	u-boot-fw-utils \
	less \
	nano \
	gnupg \
	openssh-sshd \
	openssh-sftp \
	openssh-sftp-server \
	ptpd \
	parted \
	vim \
	chromium-ozone-wayland \
	sudo \
	ptpd \
	vim \
	packagegroup-tools-bluetooth \
	packagegroup-fsl-tools-audio \
	packagegroup-fsl-tools-gpu \
	packagegroup-fsl-tools-gpu-external \
	packagegroup-fsl-tools-testapps \
	packagegroup-fsl-tools-benchmark \
	packagegroup-fsl-gstreamer1.0 \
	packagegroup-fsl-gstreamer1.0-full \
	gdb \
	libfftw \
	bmap-tools \
	alsa-equal \
	alsa-lib \
	alsa-oss \
	alsa-plugins \
	alsa-state \
	alsa-tools \
	alsa-utils \
	alsa-utils-scripts \
	gparted \
	gedit \
"

IMAGE_INSTALL_remove += " packagegroup-imx-ml "


IMAGE_INSTALL_append = " useradd-winsys "

IMAGE_FEATURES += " ssh-server-openssh "
