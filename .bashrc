# .bashrc

# Source global definitions
if [ -f /etc/bashrc ]; then
	. /etc/bashrc
fi

# User specific aliases and functions
source /mnt/biginsights/opt/ibm/biginsights/conf/biginsights-env.sh
alias hls="hadoop fs -ls /home/labuser20/"
alias ll="ls -l"
