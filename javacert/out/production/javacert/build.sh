#!/bin/bash
light_cyan='\33[1;36m'
nc='\033[0m'

javacCommand='javac lab.bjes.Main.java'
printf "Compiling java with command: ${light_cyan}$javacCommand${nc}\n"
${javacCommand}

jarCommand='jar -cf myJar.jar lab.bjes.Main.class lab/bjes/*/*.class'
printf "Building jar archive with command: ${light_cyan}$jarCommand${nc}\n"
${jarCommand}
