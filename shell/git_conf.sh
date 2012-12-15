#!/bin/bash

git config --global user.name "Karthick Sundararajan"
git config --global user.email "karthicksmail@gmail.com"

ssh-keygen -t rsa -C "karthicksmail@gmail.com"

read -p "Have you set the ssh key in the github account(y/n)?" val_set
if [ $val_set = 'y' ]
then
	ssh -T git@github.com
fi

read -p "Enter the complete path to the directory: " comp_path
mkdir -p $comp_path && cd $comp_path

git clone https://github.com/karthicksmail/progs.git
cd progs
git config --global core.excludesfile .gitignore_global

