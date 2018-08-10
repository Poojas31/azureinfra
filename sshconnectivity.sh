#!/bin/bash
# ssh-keygen -q -t rsa -f ~/.ssh/id_rsa -N ""
 sshpass -p  $1 ssh -tt -o "StrictHostKeyChecking no" $3@$2 'exit'
 sshpass -p $1 ssh-copy-id $3@$2
 echo " All Good"; exit 0
