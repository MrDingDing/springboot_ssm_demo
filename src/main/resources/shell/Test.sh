#!/usr/bin/env bash
echo hello world;
LOOP_LIMIT=9
for (( VAR = 0; VAR < ${LOOP_LIMIT}; ++VAR )); do
    # read VAR;  #将读进去的数值赋值给变量VAR
    echo test${VAR};
done
cat hosts | while read line      #注意读取脚本会忽略第一行  也就是说从第二行开始打印
do
   echo $line
done