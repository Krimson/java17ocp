#!/bin/bash
light_cyan='\33[1;36m'
nc='\033[0m'

javaCommand='java -cp myJar.jar lab.bjes.Main'
printf "Executing program using command: ${light_cyan}${javaCommand}${nc}\n\n"
${javaCommand}
