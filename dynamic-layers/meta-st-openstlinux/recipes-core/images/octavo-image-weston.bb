# Base this image on st-image-weston
require recipes-st/images/st-image-weston.bb

# Remove resize helper
IMAGE_INSTALL:remove = "resize-helper"

# Set ROOTFS partition size
IMAGE_ROOTFS_MAXSIZE = "1024000"

# Set USERFS parition size
USERFS_PARTITION_SIZE = "128000"

# Install nano editor
IMAGE_INSTALL += "nano"

IMAGE_INSTALL += "iperf3"

# Add native compile tools
IMAGE_INSTALL += "packagegroup-core-buildessential"

# Add python-pip
IMAGE_INSTALL += "python3-pip"

# Install TimeZone data
IMAGE_INSTALL += "tzdata tzdata-americas"
DEFAULT_TIMEZONE = "America/Chicago"
