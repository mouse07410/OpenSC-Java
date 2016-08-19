# opensc-java
A Java PKCS#11 wrapper and JCE Provider

The code is derived from the original (OpenSC repo)[https://github.com/OpenSC/OpenSC-Java.git]

You need a JCE Code Signer to build the module. Please create a jcesigner.cfg file one level above the project directory which contains

	# Code signer key store, key alias and password
	jarsigner.keystore=<path to keystore>
	jarsigner.alias=<key alias>
	jarsigner.password=<keystore password>

This README file is derived from (CardContact OpenSC-Java)[https://github.com/CardContact/opensc-java.git]
