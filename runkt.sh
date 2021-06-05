#!/usr/bin/env bash

KOTLIN_FILE=$1
BASENAME=$(basename ${KOTLIN_FILE} ".kt")
kotlinc "${KOTLIN_FILE}" -include-runtime -d "${BASENAME}.jar" && java -jar "${BASENAME}.jar" && rm -f "${BASENAME}.jar"
